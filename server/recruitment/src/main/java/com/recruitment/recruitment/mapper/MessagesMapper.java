package com.recruitment.recruitment.mapper;

import com.recruitment.recruitment.dto.MessageDto;
import com.recruitment.recruitment.entity.Messages;

public class MessagesMapper {
    static public Messages mapToMessages(MessageDto messageDto) {

        return new Messages(
                messageDto.getMid(),
                messageDto.getSenderId(),
                messageDto.getReceiverId(),
                messageDto.getSentAt()
        );
    }

    static public MessageDto mapToMessagesDto(Messages messages) {

        return new MessageDto(
                messages.getMid(),
                messages.getSenderId(),
                messages.getReceiverId(),
                messages.getSentAt()
        );
    }
}
