package validation;

import exceptions.ApiException;
import org.springframework.http.HttpStatus;

public class CourseValidation {

    public static void checkName(String name) {
        if (name == null || name.isEmpty()) {
            throw new ApiException("name cannot be null or empty! " + name, HttpStatus.BAD_REQUEST);
        }
    }

    public static void checkCredit(Integer credit) {
        if (credit == null || credit < 0 || credit > 4) {
            throw new ApiException("credit is null or not between 0-4!", HttpStatus.BAD_REQUEST);
        }
    }



    public static void checkId(Integer id) {
        if(id == null || id < 0){
            throw new ApiException("id cannot be null or less than zero! id= "+id,HttpStatus.BAD_REQUEST);
        }
    }
}
