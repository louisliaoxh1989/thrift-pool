package com.insto.thriftpool;

import lombok.Getter;

public class ServerInfo {

    @Getter private final String host;
    @Getter private final int port;

    public ServerInfo(String host, int port) {
        this.host = host;
        this.port = port;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((host == null) ? 0 : host.hashCode());
        result = prime * result + port;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        ServerInfo other = (ServerInfo) obj;
        if (host == null) {
            if (other.host != null) return false;
        } else if (!host.equals(other.host)) return false;
        if (port != other.port) return false;
        return true;
    }

    @Override
    public String toString() {
        return "ServerInfo [host=" + host + ", port=" + port + "]";
    }
}
