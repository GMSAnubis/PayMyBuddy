package com.paymybuddy.app.exception;

import com.paymybuddy.app.model.ExceptionResponse;
import java.util.Date;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class ExceptionHandling {
  private static final Logger logger = LogManager.getLogger("paymybuddy.ExceptionHandling");

  @ExceptionHandler(NotEnoughFundException.class)
  @ResponseBody
  public ExceptionResponse handleTypeMismatchException(NotEnoughFundException notEnoughFundException,
                                                       HttpServletRequest request,
                                                       HttpServletResponse responseCode) {
    responseCode.setStatus(400);
    ExceptionResponse response = new ExceptionResponse(new Date(), 400, "Not Enough funds",
            request.getRequestURI()
    );
    logger.info(request.getMethod() + " " + request.getRequestURI() + " " + response.getError());
    logger.error("ERROR: " + response.toString());

    return response;
  }

  @ExceptionHandler(CantWithdrawException.class)
  @ResponseBody
  public ExceptionResponse handleCantWithdrawException(CantWithdrawException cantWithdrawException,
                                                       HttpServletRequest request,
                                                       HttpServletResponse responseCode) {
    responseCode.setStatus(400);
    ExceptionResponse response = new ExceptionResponse(new Date(), 400, "Cant withdraw funds.",
            request.getRequestURI()
    );
    logger.info(request.getMethod() + " " + request.getRequestURI() + " " + response.getError());
    logger.error("ERROR: " + response.toString());

    return response;
  }

  @ExceptionHandler(StillFundOnAccountException.class)
  @ResponseBody
  public ExceptionResponse stillFundOnAccountException(StillFundOnAccountException stillFundOnAccountException,
                                                       HttpServletRequest request,
                                                       HttpServletResponse responseCode) {
    responseCode.setStatus(400);
    ExceptionResponse response = new ExceptionResponse(new Date(), 400, "Can't delete account " +
            "there is still fund to withdraw.",
            request.getRequestURI()
    );
    logger.info(request.getMethod() + " " + request.getRequestURI() + " " + response.getError());
    logger.error("ERROR: " + response.toString());

    return response;
  }

  @ExceptionHandler(AllreadyFriendException.class)
  @ResponseBody
  public ExceptionResponse allreadyFriendException(AllreadyFriendException allreadyFriendException,
                                                   HttpServletRequest request,
                                                   HttpServletResponse responseCode) {
    responseCode.setStatus(400);
    ExceptionResponse response = new ExceptionResponse(new Date(), 400, "You are already friends",
            request.getRequestURI()
    );
    logger.info(request.getMethod() + " " + request.getRequestURI() + " " + response.getError());
    logger.error("ERROR: " + response.toString());

    return response;
  }

  @ExceptionHandler(NoFriendShipFound.class)
  @ResponseBody
  public ExceptionResponse noFriendShipFound(NoFriendShipFound noFriendShipFound,
                                             HttpServletRequest request,
                                             HttpServletResponse responseCode) {
    responseCode.setStatus(400);
    ExceptionResponse response = new ExceptionResponse(new Date(), 400, "No friendship found",
            request.getRequestURI()
    );
    logger.info(request.getMethod() + " " + request.getRequestURI() + " " + response.getError());
    logger.error("ERROR: " + response.toString());

    return response;
  }
}
