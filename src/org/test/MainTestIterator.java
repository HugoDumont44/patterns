package org.test;

import iterator.model.Channel;
import iterator.model.ChannelTypeEnum;
import iterator1.ChannelCollection;
import iterator1.ChannelCollectionImpl;
import iterator1.ChannelIterator;

public class MainTestIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testChannels();
	}

	private static void testChannels() {
		ChannelCollection channels = generateChanels();
		ChannelIterator baseIterator = channels
				.iterator(ChannelTypeEnum.GENERAL);
		while (baseIterator.hasNext()){
			Channel c = baseIterator.next();
			System.out.println(c.toString());
		}
		System.out.println("*******");
		// Channel Type Iterator
		ChannelIterator news = channels
				.iterator(ChannelTypeEnum.NEWS);
		while (news.hasNext()){
			Channel c = news.next();
			System.out.println(c.toString());
		}
	}
	
	
	private static ChannelCollection generateChanels() {
		ChannelCollection channels = new ChannelCollectionImpl();
		channels.addChannel(new Channel("Offive", ChannelTypeEnum.MUSIC));
		channels.addChannel(new Channel("France Musique", ChannelTypeEnum.MUSIC));
		channels.addChannel(new Channel("Aljazzera Kids", ChannelTypeEnum.KIDS));
		channels.addChannel(new Channel("BBC", ChannelTypeEnum.NEWS));
		channels.addChannel(new Channel("France 2", ChannelTypeEnum.GENERAL));
		channels.addChannel(new Channel("BFM TV", ChannelTypeEnum.NEWS));
		return channels;
	}
	
}
