//package com.ssm.springmvc.config;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.PrintWriter;
//import java.io.StringWriter;
//
///**
// * 所有Controller访问时抛出异常后的处理类，返回结果为json
// */
//@RestControllerAdvice
//public class SystemExceptionHandler {
//
//    //定义一个全局的记录器，通过LoggerFactory获取
//    private final static Logger logger = LoggerFactory.getLogger(SystemExceptionHandler.class);
//
//    public static boolean START_LOG = false;
//
//    public static final StringBuffer logBuffer = new StringBuffer(1024);
//
//    @Resource
//    PF_CRASHMapper pf_crashMapper;
//
//    @ExceptionHandler(Exception.class)
//    public ResponseData defaultErrorHandler(HttpServletRequest request, HttpServletResponse response, Exception e) throws Exception {
//        ResponseData responseData = new ResponseData(405, e.getMessage());
//        if (e instanceof TMESInfoException) {
//            response.setStatus(405);
//        } else if (e instanceof TMESFileUploadException) {
//            response.setStatus(200);
//        } else {
//            if (e instanceof NullPointerException) {
//                responseData.setMsg("空指针异常，请联系管理员");
//            }
//            StringWriter sw = new StringWriter();
//            PrintWriter pw = new PrintWriter(sw);
//            e.printStackTrace(pw);
//            sw.close();
//            pw.close();
//            //写入数据库
//            response.setStatus(405);
//            PF_CRASH pf_crash = new PF_CRASH();
//            pf_crash.setGID(GUID.getUUID());
//            pf_crash.setBRIEF(responseData.getMsg());
//            pf_crash.setMESSAGE(sw.toString());
//            pf_crash.setCLAZZ(e.getClass().toString());
//            pf_crash.setOPERATOR(UserService.getUsername());
//            pf_crashMapper.insertSelective(pf_crash);
//            logger.error("ERROR:", e);
//            if (START_LOG) {
//
//                logBuffer.append(sw.toString());
//                if (logBuffer.length() > 10 * 1000) {
//                    logBuffer.delete(0, logBuffer.length());
//                }
//
//            }
//        }
//        return responseData;
//    }
//
//}
