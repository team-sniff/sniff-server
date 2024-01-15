package server.acode.global.common;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum ErrorCode {

    /* 400 BAD REQUEST */
    REQUEST_VALIDATION_EXCEPTION(HttpStatus.BAD_REQUEST, "잘못된 요청입니다."),
    USER_NOT_FOUND(HttpStatus.BAD_REQUEST, "해당 사용자를 찾을 수 없습니다."),
    FAMILY_NOT_FOUND(HttpStatus.BAD_REQUEST, "해당 계열을 찾을 수 없습니다."),
    INGREDIENT_NOT_FOUND(HttpStatus.BAD_REQUEST, "해당 향료를 찾을 수 없습니다."),
    INGREDIENT_TYPE_NOT_FOUND(HttpStatus.BAD_REQUEST, "해당 계열에 일치하는 계열타입을 찾을 수 없습니다."),
    BRAND_NOT_FOUND(HttpStatus.BAD_REQUEST,"해당 브랜드를 찾을 수 없습니다." ),

    /* 401 UNAUTHORIZED */


    /* 403 FORBIDDEN */


    /* 404 NOT FOUND */
    FRAGRANCE_NOT_FOUND(HttpStatus.NOT_FOUND, "해당 향수를 찾을 수 없습니다."),
    REVIEW_SEASON_NOT_FOUND(HttpStatus.NOT_FOUND, "관리자에게 문의 바랍니다."),
    REVIEW_LONGEVITY_NOT_FOUND(HttpStatus.NOT_FOUND, "관리자에게 문의 바랍니다."),
    REVIEW_INTENSITY_NOT_FOUND(HttpStatus.NOT_FOUND, "관리자에게 문의 바랍니다."),
    REVIEW_STYLE_NOT_FOUND(HttpStatus.NOT_FOUND, "관리자에게 문의 바랍니다.");


    /* 409 CONFLICT */


    /* 500 INTERNAL SERVER ERROR */
//    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "관리자에게 문의 바랍니다.");

    private final HttpStatus httpStatus;
    private final String message;

    public int getHttpStatusCode() {
        return httpStatus.value();
    }
}
