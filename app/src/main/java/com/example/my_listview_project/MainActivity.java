package com.example.my_listview_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GoodsListAdapter my_adapter;
    ListView myListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myListView = findViewById(R.id.goodsList);
        ArrayList<Product> products = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            products.add(new Product("Нож", "100001", "Немецкий нож. Изготовлен из высококлассной нержавеющей стали.", 1950));
            products.add(new Product("Фонтан: Гномы в деревне", "100002", "Фонтан настольный с подсветкой. Производство: Китай", 7643));
            products.add(new Product("Конструктор из дерева.Собери своими руками", "100003", "Конструктор содержит 300 деталей. Россия.", 2399));
            products.add(new Product("Кружка керамика", "100004", "Французская кружка из высокопрочной керамики", 478));
            products.add(new Product("Скульптура из керамики: Пантера", "100005", "Керамическая скульптура: Пантера изготовлена лучшими итальянскими мастерами.", 49550));
        }

        my_adapter = new GoodsListAdapter(this, products);
        myListView.setAdapter(my_adapter);

    }
}