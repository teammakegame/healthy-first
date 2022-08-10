//package com.lhtrung.healthyfirst.others;
//
//import org.w3c.dom.*;
//import javax.xml.parsers.*;
//import java.io.*;
//
//import java.io.File;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Xml {
//    private List<Object> objList = new ArrayList<>();
//    private Object obj = null;
//    private File inputFile;
//
//    public Xml (String pathName) {
//        inputFile = new File(pathName);
//        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//        Document doc = dBuilder.parse(inputFile);
//        doc.getDocumentElement().normalize();
//    }
//
//    public List<Object> getObjList() {
//        return objList;
//    }
//
//    public void setObjList(List<Object> objList) {
//        this.objList = objList;
//    }
//
//    public Object getObj() {
//        return obj;
//    }
//
//    public void setObj(Object obj) {
//        this.obj = obj;
//    }
//
//    public File getInputFile() {
//        return inputFile;
//    }
//
//    public void setInputFile(File inputFile) {
//        this.inputFile = inputFile;
//    }
//}
