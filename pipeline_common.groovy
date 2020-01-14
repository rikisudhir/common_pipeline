#!/usr/bin/env groovy

def addition( def number1, def number2) { // TODO: replace this with common function once updated
    try {
        return number1+number2
    } catch (error) {
         echo "ERROR: Failed to add."
		 throw error
		 
    }
}