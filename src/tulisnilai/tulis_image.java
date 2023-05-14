/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tulisnilai;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 *
 * @author Fikri
 */
public class tulis_image {
    
        public static BufferedImage resizeImage(Image image, int width, int height) {
        // Mengatur ukuran gambar yang diinginkan
        Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        
        // Mengubah Image menjadi BufferedImage
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = bufferedImage.createGraphics();
        graphics.drawImage(scaledImage, 0, 0, null);
        graphics.dispose();
        
        return bufferedImage;
    }
        
        public ImageIcon setIcon(String image){
            ImageIcon icon = new ImageIcon(getClass().getResource(image));
            int newWidth = 150;
            int newHeight = 250;

            Image resizedImage = icon.getImage().getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
            ImageIcon resizedIcon = new ImageIcon(resizedImage);
            return resizedIcon;
        }
}

