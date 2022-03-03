package tarea11FactoryRequestToken;

import io.restassured.response.Response;

public interface IRequestToken {
    Response send(RequestInformation requestInformation,String token);
}
