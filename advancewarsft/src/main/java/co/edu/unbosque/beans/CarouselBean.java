package co.edu.unbosque.beans;

import jakarta.annotation.PostConstruct;
import jakarta.faces.bean.ManagedBean;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
@Named("carouselBean")
public class CarouselBean implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Item> items;

    @PostConstruct
    public void init() {
        items = new ArrayList<>();
        items.add(new Item("Images/ima1.png"));
        items.add(new Item("Images/ima2.png"));
        items.add(new Item("Images/ima3.png"));
        items.add(new Item("Images/ima1.png"));
        // Puedes añadir más imágenes si quieres
    }

    public List<Item> getItems() {
        return items;
    }

    public static class Item {
        private String imagePath;

        public Item(String imagePath) {
            this.imagePath = imagePath;
        }

        public String getImagePath() {
            return imagePath;
        }
    }
}
