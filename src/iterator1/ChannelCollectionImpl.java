package iterator1;

import java.util.ArrayList;
import java.util.List;

import iterator.model.Channel;
import iterator.model.ChannelTypeEnum;

public class ChannelCollectionImpl implements ChannelCollection{
	private List<Channel> channels;
	
	public ChannelCollectionImpl() {
		// TODO Auto-generated constructor stub
		channels = new ArrayList<>();
	}
	
	@Override
	public void addChannel(Channel c) {
		// TODO Auto-generated method stub
		channels.add(c);
	}

	@Override
	public void removeChannel(Channel c) {
		// TODO Auto-generated method stub
		channels.remove(c);
	}

	@Override
	public ChannelIterator iterator(ChannelTypeEnum type) {
		// TODO Auto-generated method stub
		return new ChannelIteratorImpl(type, this.channels);
	}
	

	
	private class ChannelIteratorImpl implements ChannelIterator {
		private ChannelTypeEnum type;
		private List<Channel> channels;
		private int position;
		
		public ChannelIteratorImpl(ChannelTypeEnum type, List<Channel> channels) {
			this.type = type;
			this.channels = channels;
		}
		
		public boolean hasNext() {
			while (position < channels.size()) {
				Channel c = channels.get(position);
				if (c.getTYPE().equals(type)
						|| type.equals(ChannelTypeEnum.GENERAL)){
					return true;
				}
				else {
					position++;
				}
			}
			return false;
		}
		
		public Channel next(){
			Channel c = channels.get(position);
			position++;
			return c;
		}
		
	}

}
