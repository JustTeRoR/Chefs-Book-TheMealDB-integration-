package com.justterror.chefsbook.view.detail;

import com.justterror.chefsbook.model.Meals;

public interface DetailView {
    void showLoading();
    void hideLoading();
    void setMeal(Meals.Meal meal);
    void onErrorLoading(String message);
}
