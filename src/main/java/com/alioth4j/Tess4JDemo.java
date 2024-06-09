package com.alioth4j;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

/**
 * Tess4j演示
 * @author Alioth4J
 */
public class Tess4JDemo {

    public static void main(String[] args) {
        // 创建 File 对象表示要识别的图像文件
        File imgFile = new File("src/main/resources/example.png");
        // 创建 Tesseract 对象
        Tesseract tess = new Tesseract();
        // 设置训练数据所在位置
        tess.setDatapath("src/main/resources/tess4j");
        // 设置语言：英文 -> eng; 简体中文 -> chi_sim
        tess.setLanguage("chi_sim");
        // 字符串对象用于接收结果
        String imgText = null;
        // 执行 OCR
        try {
            imgText = tess.doOCR(imgFile);
        } catch (TesseractException e) {
            e.printStackTrace();
        }
        // 输出结果
        System.out.println("OCR 结果：");
        System.out.println(imgText);
    }

}
