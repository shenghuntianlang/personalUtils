package com.customutils.forservlet;

import java.io.*;

public class personalIOUtill {
    private BufferedReader bufferedReader;
    private String source;
    private String filePath;

    public personalIOUtill() {

    }

    public personalIOUtill(InputStream inputStream) throws IOException {
        this.bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        getSource();
    }

    public personalIOUtill(InputStream inputStream, String filePath) throws IOException {
        this.bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        this.filePath = filePath;
        getSource();
    }

    private void getSource() throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        String receive;
        while ((receive = bufferedReader.readLine()) != null) {
            stringBuilder.append(receive);
        }
        this.source = stringBuilder.toString();
    }

    public BufferedReader getBufferedReader() {
        return bufferedReader;
    }

    public void setBufferedReader(InputStream inputStream) throws IOException {
        this.bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        getSource();
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String parseToString() throws IOException {
        return source;
    }

    public void writeStringToFile() throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath), "utf-8"));
        bufferedWriter.write(source);
        bufferedWriter.newLine();
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    public void closeIOStream() throws IOException {
        bufferedReader.close();
    }
}
