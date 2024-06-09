## Tess4j 基础演示
### 简介
Tesseract 是一个开源 OCR 引擎，能将图像中的文本转换为可编辑的文本数据。  
Tess4J 是基于 Java 的 Tesseract 的封装库，使 Java 开发者能够方便地利用 Tesseract 进行文本识别。
### 环境配置
#### Linux
不需要环境配置，大多数 Linux 发行版中都包含 Tesseract。

#### Windows  
- 下载 Tesseract 安装包：[https://digi.bib.uni-mannheim.de/tesseract/](https://digi.bib.uni-mannheim.de/tesseract/)
- 傻瓜式安装
- 配置环境变量（在系统变量中配置）  
变量名：`TESSDATA_PREFIX`  
变量值：`你的安装目录\Tesseract-OCR\tessdata`
### 下载训练数据
- 下载中文训练数据：[https://github.com/tesseract-ocr/tessdata_fast/blob/main/chi_sim.traineddata](https://github.com/tesseract-ocr/tessdata_fast/blob/main/chi_sim.traineddata)  
在这里也有其他版本：[https://github.com/tesseract-ocr/tessdoc/blob/main/Data-Files.md](https://github.com/tesseract-ocr/tessdoc/blob/main/Data-Files.md)
### 项目构建
- `pom.xml` 文件中引入 tess4j 以及日志依赖  
- `log4j.properties` 作为 log4j 的配置文件  
- 将训练数据文件复制到 `src/main/resources/tess4j` 文件夹中
- `src/main/resources` 中放入需要进行 OCR 操作的图片  
- 新建 `Tess4JDemo` 类，编写关键代码（代码中有注释）  
### 运行项目
- 运行 `Tess4JDemo#main` 方法即可