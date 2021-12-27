import io.grpc.Server;
import io.grpc.ServerBuilder;
import user.UserService;

import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server= ServerBuilder.forPort(8081).addService(new UserService()).build();
        server.start();
        System.out.println("server started at " +server.getPort());
        server.awaitTermination();
    }
}
