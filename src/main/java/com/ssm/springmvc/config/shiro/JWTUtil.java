package com.ssm.springmvc.config.shiro;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JWTUtil {

    // 过期时间5分钟
    private static final long EXPIRE_TIME = 8*60*60*1000;

    /**
     * 校验token是否正确
     * @param token 密钥
     * @param orginSecret 用户原始密码，数据库密码
     * @return 是否正确
     */
    public static boolean verify(String token, String username, String orginSecret) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(orginSecret);
            JWTVerifier verifier = JWT.require(algorithm)
                    .withClaim("username", username)
                    .build();

            DecodedJWT jwt = verifier.verify(token);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    /**
     * 获得token中的信息无需secret解密也能获得
     * @return token中包含的用户名
     */
    public static String getUsername(String token) {
        try {
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getClaim("username").asString();
        } catch (JWTDecodeException e) {
            return null;
        }
    }



    /**
     * 生成jwt token，用于之后的登录验证,包含用户名信息
     * @param username 用户名
     * @param password 用户的密码
     * @return 加密的token
     */
    public static String create(String username, String password) {
        try {
            Date date = new Date(System.currentTimeMillis()+EXPIRE_TIME);
            Algorithm algorithm = Algorithm.HMAC256(password);
            Map<String,Object> map = new HashMap<>();
            map.put("alg","HS256");
            map.put("typ","JWT");
            // 附带username信息
            return JWT.create()
                    .withHeader(map)
                    .withClaim("username", username)
                    .withExpiresAt(date)
                    .sign(algorithm);
        } catch (Exception e) {
            return null;
        }
    }
}
