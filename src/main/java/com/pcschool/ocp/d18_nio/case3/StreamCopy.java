package com.pcschool.ocp.d18_nio.case3;

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class StreamCopy {
    public static void main(String[] args) throws Exception {
        String surl = "https://pic.pimg.tw/juju1223/1515483163-3136697996_wn.jpg";
        URI uri = URI.create(surl);
        Path dest = Paths.get("src\\main\\java\\com\\pcschool\\ocp\\d18_nio\\baby.jpg");
        Files.copy(uri.toURL().openStream(), dest, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Copy 成功!");
    }
}
