package cn.willyee.kgraph.service;

import cn.willyee.kgraph.model.History;

import java.util.List;

public interface HistoryService {

    List<History> getHistoriesByNameAndType(String userName, String historyScope);

    Integer insertHistory(History history);

    Integer deleteHistoryById(Integer historyId);

}
