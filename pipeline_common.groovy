#!/usr/bin/env groovy

def addition( def number1, def number2) { // TODO: replace this with common function once updated
    try {
        return number1+number2
    } catch (error) {
         echo "ERROR: Failed to add."
		 throw error
		 
    }
}


def substraction(def number1, def number2){

try{
    if (number1 < number2){
    echo "substraction cannot happen"
 }
    else {
    return number1-number2 
  }
}   catch(error){
    echo "ERROR: Failed to substract."
    throw error
}
}

def multiplication(def number1, def number2){

try {
        return number1*number2
		
    } catch (error) {
         echo "ERROR: Failed to add."
		 throw error
		 
    }
}
}


def division(def number1, def number2){

try{
    if (number1=0||number2=0){
    echo "Division cannot happen"
 }
    else {
    return number1/number2 
  }
}   catch(error){
    echo "ERROR: Failed to substract."
    throw error
}
}
