/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apdaterpattern;

/**
 *
 * @author thuannd
 */
public class ApdaterPatternMain {

    /**
     * Muốn tạo 1 lớp tái sử dụng có thể hoạt động được với những lớp khác không
     * liên hệ gì với nó và không nhất thiết phải tương thích
     */
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }

}
