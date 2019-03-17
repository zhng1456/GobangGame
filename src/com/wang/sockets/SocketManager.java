package com.wang.sockets;

import java.util.HashMap;


/*
 * 用于有多局game时对Socket进行管理
 */
public class SocketManager {
	//concurrent包的线程安全Set，用来存放每个客户端对应的GoBangGame对象。
	  private static HashMap<Integer,GoBangGame> webSocketMap = new HashMap<Integer,GoBangGame>();
}
