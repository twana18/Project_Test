package Views;

import Models.Adminstrator;

import java.net.Socket;

public class AdminstratorView {
    private final Adminstrator adminstrator;
    private Socket socket;

    public AdminstratorView(Adminstrator adminstrator) {
        this.adminstrator = adminstrator;
        this.socket = socket;
        System.out.println(this.adminstrator.name());
    }
}
