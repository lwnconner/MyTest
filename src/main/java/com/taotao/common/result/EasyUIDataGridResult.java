package com.taotao.common.result;

import java.util.List;

/**
 * 公共返回结果类
 *
 * @author 李吴楠 18717344828
 * @version 1.0' 2017/8/22
 */
public class EasyUIDataGridResult {

    private Integer page;

    private List<?> rows;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
