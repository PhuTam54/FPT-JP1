package javafx2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ProductController {
    public TextField txtName;
    public TextField txtPrice;
    public TextField txtQty;
    public TextField txtDescription;
    public TextField txtCategory;
    public static ObservableList<Product> listProducts = FXCollections.observableArrayList();
    public ListView<Product> productView;
    public static Product editProduct;
    public void submit(ActionEvent actionEvent) {
        String name = txtName.getText();
        String price = txtPrice.getText();
        String qty = txtQty.getText();
        String des = txtDescription.getText();
        String category = txtCategory.getText();
        if (editProduct != null) {
            editProduct.setName(name);
            editProduct.setPrice(price);
            editProduct.setQty(qty);
            editProduct.setDes(des);
            editProduct.setCategory(category);
            productView.setItems(listProducts);
            productView.refresh();
            editProduct = null;
            txtName.clear();
            txtPrice.clear();
            txtQty.clear();
            txtDescription.clear();
            txtCategory.clear();
            return;
        }

        try {
            for (Product p: listProducts) {
                if (p.getName().equals(name))
                    throw new Exception("Ten sp da ton tai");
            }
            Product pd = new Product(name, price, qty, des, category);
            listProducts.add(pd);
            productView.setItems(listProducts);
            txtName.clear();
            txtPrice.clear();
            txtQty.clear();
            txtDescription.clear();
            txtCategory.clear();
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(e.getMessage());
            alert.show();
//            return;
        }
    }
    public void editProduct(MouseEvent mouseEvent) {
        editProduct = productView.getSelectionModel().getSelectedItem();
        if (editProduct != null) {
            txtName.setText(editProduct.getName());
            txtPrice.setText(editProduct.getPrice());
            txtQty.setText(editProduct.getQty());
            txtDescription.setText(editProduct.getDes());
            txtCategory.setText(editProduct.getCategory());
        }
    }

    public void delete(ActionEvent mouseEvent) {
        editProduct = productView.getSelectionModel().getSelectedItem();
        if (editProduct != null) {
            txtName.deleteText(0, editProduct.getName().length());
            txtPrice.deleteText(0, editProduct.getPrice().length());
            txtQty.deleteText(0, editProduct.getQty().length());
            txtDescription.deleteText(0, editProduct.getDes().length());
            txtCategory.deleteText(0, editProduct.getCategory().length());
        }
    }
}


