package com.csf.databrowser.service;

import com.csf.databrowser.request.ExtractRequest;
import com.csf.databrowser.resp.CompaniesExtractResp;
import com.csf.databrowser.resp.CompaniesInfoResp;
import com.csf.databrowser.resp.CompanySearchResp;

import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;

public interface CompanyService {

    CompaniesInfoResp getCompanyInfo(String keyword, Integer page, Integer size);

    CompanySearchResp searchCompanys(InputStream is);

    CompaniesExtractResp extract(ExtractRequest request);

    String download(HttpServletRequest request);
}