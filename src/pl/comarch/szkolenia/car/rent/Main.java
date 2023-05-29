package pl.comarch.szkolenia.car.rent;

import org.apache.commons.codec.digest.DigestUtils;

public class Main {
    public static void main(String[] args) {
        String password = "adminD4@af!CvYAFx*927Mk*uZ0gC1%fgREqF";
        String hash = DigestUtils.md5Hex(password);
        System.out.println(hash);
    }
}
