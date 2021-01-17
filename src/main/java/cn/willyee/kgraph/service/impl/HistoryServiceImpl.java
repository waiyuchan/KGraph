package cn.willyee.kgraph.service.impl;

import cn.willyee.kgraph.model.History;
import cn.willyee.kgraph.mapper.HistoryMapper;
import cn.willyee.kgraph.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryServiceImpl implements HistoryService {

    @Autowired
    private HistoryMapper historyMapper;

    @Override
    public List<History> getHistoriesByNameAndType(String userName, String historyType) {
        return historyMapper.getHistoriesByNameAndType(userName, historyType);
    }

    @Override
    public Integer insertHistory(History history) {
        return historyMapper.insertHistory(history);
    }

    @Override
    public Integer deleteHistoryById(Integer historyId) {
        return historyMapper.deleteHistoryById(historyId);
    }

}
