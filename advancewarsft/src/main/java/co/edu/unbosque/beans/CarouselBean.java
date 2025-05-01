package co.edu.unbosque.beans;

import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@Named("carouselBean")
@ViewScoped
public class CarouselBean implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<String> imageUrls;

    public CarouselBean() {
        imageUrls = Arrays.asList(
            "Images/mision1.png",
            "Images/mision2.png",
            "Images/mision3.png",
            "Images/mision4.png",
            "Images/mision3.png"
        );
    }

    public List<String> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }
}


