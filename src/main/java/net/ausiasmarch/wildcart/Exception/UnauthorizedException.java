package net.ausiasmarch.wildcart.Exception;

public class UnauthorizedException extends RuntimeException {

    public UnauthorizedException() {
        super("ERROR: Unauthorized access attempt");
    }

}
