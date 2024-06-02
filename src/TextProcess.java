public class TextProcess {
    // 处理文本内容
    public static String text_process(String content) {
        // 去除标点符号
        content = content.replaceAll("[^a-zA-Z\\s]", " ");
        // 去除多余空格
        content = content.replaceAll("\\s+", " ");
        // 转换为小写
        content = content.toLowerCase();
        return content;
    }
}
