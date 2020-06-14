package com.justterror.chefsbook.view.home;

import com.justterror.chefsbook.model.Categories;
import com.justterror.chefsbook.model.Meals;

import java.util.List;

public interface HomeView {
    void showLoading();
    void hideLoading();
    void setMeal(List<Meals.Meal> meal);
    void setCategory(List<Categories.Category> category);
    void onErrorLoading(String message);
}
