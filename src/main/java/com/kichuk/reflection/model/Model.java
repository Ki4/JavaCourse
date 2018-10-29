package com.kichuk.reflection.model;

import com.kichuk.reflection.view.View;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Model {
    private View view;

    public Model(View view) {
        this.view = view;
    }

    public void reflectionTestMethods() {
        Truck truck = new Truck("BMW", 12, 740.0, 200.0, 180.0);
        Class <?> testClass = truck.getClass();
        Method [] methods = testClass.getMethods();
        for (Method round: methods) {
            if(round.isAnnotationPresent(TestAnnotation.class)){
                try{
                    round.invoke(truck);
                }
                catch(IllegalAccessException | InvocationTargetException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public void showNamesAboutClassAndInterface(Class <?> someClass){
        view.showNameOfTheClass(someClass.getName());
        view.showNameOfInterface(someClass.getInterfaces());


    }

    public double inputDoubleValidation() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()) {
            view.incorrectData();
            scanner.next();
        }
        return scanner.nextDouble();
    }


}
