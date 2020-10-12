package com.hnguigu.cms.response;

import com.hnguigu.cms.CmsPage;
import com.hnguigu.model.response.ResponseResult;
import com.hnguigu.model.response.ResultCode;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class CmsPageResult extends ResponseResult {
    CmsPage  cmsPage;
    public CmsPageResult(ResultCode resultCode, CmsPage cmsPage) {
        super(resultCode);
        this.cmsPage = cmsPage;
    }
}
