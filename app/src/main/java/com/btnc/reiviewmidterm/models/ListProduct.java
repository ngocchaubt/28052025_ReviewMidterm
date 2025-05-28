package com.btnc.reiviewmidterm.models;

import java.util.ArrayList;

public class ListProduct {
    ArrayList<Product> products;
    public ListProduct()
    {
        products=new ArrayList<>();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
    public void generate_sample_product_dataset() {
        products.add(new Product(1, "SP001", "Bộ trang sức vòng cổ và lắc tay ngọc trai trắng", 78000, "https://salt.tikicdn.com/cache/750x750/ts/product/19/c7/61/61ee57d3c8c67570c30cce67a4d58b04.jpeg"));
        products.add(new Product(2, "SP002", "Bộ Trang Sức Ngọc Trai Cao Cấp Dây Chuyền Và Bông Tai Vàng 14k BTCC83 Huy Thanh Jewelry", 2362000, "https://salt.tikicdn.com/cache/750x750/ts/product/96/cd/bf/fa2e00feed5b147b08c01e3bd233fe1e.jpg"));
        products.add(new Product(3, "SP003", "Bộ trang sức bạc đính đá MS134", 115000, "https://salt.tikicdn.com/cache/750x750/ts/product/0a/b5/2d/6993e08563cce0e011dbf3eef7053c24.jpg"));
        products.add(new Product(4, "SP004", "Bộ trang sức bạc mặt đá tròn chất liệu bằng bạc MS174", 80000, "https://salt.tikicdn.com/cache/750x750/ts/product/e1/74/17/db4a7a2fb1f761be656ff9fecdfc973f.jpg"));
        products.add(new Product(5, "SP005", "Bộ trang sức bạc nhẫn và bông tai thời trang chất liệu bạc MS95t", 73000, "https://salt.tikicdn.com/cache/750x750/ts/product/20/ba/ac/9986836cdf322049555f14efc0f29cb7.jpg"));
        products.add(new Product(6, "SP006", "Bộ trang sức dành cho nữ cao cấp", 330000, "https://salt.tikicdn.com/cache/750x750/ts/product/04/72/ec/e2948d3c37699a09f289f3a544ba5187.jpg"));
        products.add(new Product(7, "SP007", "Bộ trang sức nạm đá BHB67", 39665, "https://salt.tikicdn.com/cache/750x750/ts/product/77/6f/a6/bdc2e5fe6c47abee284d9c2cd3e898b1.jpeg"));
        products.add(new Product(8, "SP008", "Bộ trang sức hoa nạm đá zircon 2 món BHB88", 79000, "https://salt.tikicdn.com/cache/750x750/ts/product/75/61/c9/3b7995c9cd3099a3699331500f597123.jpg"));
        products.add(new Product(9, "SP009", "Bộ trang sức dây chuyền bông tai hoa đào Nhật Bản BHB41", 105000, "https://salt.tikicdn.com/cache/750x750/ts/product/57/88/7b/13ddf4fc3712836a738bf8d3f0cd13aa.jpg"));
        products.add(new Product(10, "SP010", "Bộ trang sức bạc mặt túi tiền chất liệu bạc s925 MS175b1", 130000, "https://salt.tikicdn.com/cache/750x750/ts/product/b8/37/71/3bfdc50a5024bbeba45cf8a3c3f71dd4.jpg"));
        products.add(new Product(11, "SP011", "Bộ trang sức bạc thời trang chất liệu bạc 925 MS17c", 276360, "https://salt.tikicdn.com/cache/750x750/ts/product/0a/70/4d/fd4a4eea790278d74bb3e036ac4f5591.jpg"));
        products.add(new Product(12, "SP012", "Bộ trang sức nữ 2 món mặt tròn đính đá Huyền thoại biển ", 159000, "https://salt.tikicdn.com/cache/750x750/ts/product/e1/4a/ca/337e5b17efe26cc413a19b9df9a16cd0.jpg"));
        products.add(new Product(13, "SP013", "Bộ trang sức 3 món vòng cổ, vòng tay và bông tai ngọc trai zic zac phong cách thời trang Hàn Quốc", 185000, "https://salt.tikicdn.com/cache/750x750/ts/product/a2/3f/0f/3f5470ed96c6aaa8c4996ac811807eb7.jpg"));
        products.add(new Product(14, "SP014", "Bộ trang sức cô dâu 3 món vương miện cô dâu vòng cổ và bông tai đính đá tinh tế sang trọng", 394000, "https://salt.tikicdn.com/cache/750x750/ts/product/d3/6f/f0/14cc693ac2dc2d1cac07c530e98e7128.jpg"));
        products.add(new Product(15, "SP015", "Bông tai nữ hoa nhí kết vòng thiết kế dễ thương phụ kiện tra", 52000, "https://salt.tikicdn.com/cache/750x750/ts/product/da/05/a7/0caab1be063dd50ff903ae571d2d3f8d.jpg"));


    }
}
