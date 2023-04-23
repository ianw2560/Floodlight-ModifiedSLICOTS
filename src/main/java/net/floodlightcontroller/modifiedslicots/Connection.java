package net.floodlightcontroller.modifiedslicots;

import org.projectfloodlight.openflow.types.MacAddress;
import org.projectfloodlight.openflow.types.IPv4Address;

public class Connection {
    private IPv4Address srcIp;
    private IPv4Address dstIp;
    private MacAddress srcMac;
    private MacAddress dstMac;
    private String status;

    public Connection(IPv4Address srcIp, IPv4Address dstIp, MacAddress srcMac, MacAddress dstMac, String status) {
        this.srcIp = srcIp;
        this.dstIp = dstIp;
        this.srcMac = srcMac;
        this.dstMac = dstMac;
        this.status = status;
    }
    
    public IPv4Address getSrcIp() {
        return srcIp;
    }
    
    public IPv4Address getDstIp() {
        return dstIp;
    }
    
    public MacAddress getSrcMac() {
        return srcMac;
    }
    
    public MacAddress getDstMac() {
        return dstMac;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
}
