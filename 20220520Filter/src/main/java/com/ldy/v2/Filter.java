package com.ldy.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : ldy
 * @version : 1.0
 */
public interface Filter {
  boolean doFilter(Request request,Response response,FilterChain filterChain);
}

class Request{
  String str;
}

class Response{
  String str;
}

class HTMLFilter implements Filter{

  @Override
  public boolean doFilter(Request request, Response response, FilterChain filterChain) {
    request.str = request.str.replaceAll("<","[").
            replaceAll(">","]") + "HTMLFilter()";
    filterChain.doFilter(request,response);
    response.str += "--HTMLFilter";
    return true;
  }
}

class SensitiveFilter implements Filter{
  @Override
  public boolean doFilter(Request request, Response response, FilterChain filterChain) {
    request.str = request.str.replaceAll("996","995")+
            "SensitiveFilter()";
    filterChain.doFilter(request,response);
    response.str += "--SensitiveFilter()";
    return true;
  }
}


class FilterChain{
    List<Filter> filters = new ArrayList<>();
    int index = 0;

    public FilterChain add(Filter f){
      filters.add(f);
      return this;
    }

  public boolean doFilter(Request request, Response response) {
    if (index == filters.size()) return false;
    Filter f = filters.get(index);
    index++;
    f.doFilter(request,response,this);
    return true;
  }
}

class Main{
  public static void main(String[] args) {
    Request request = new Request();
    request.str = "大家好：<scirpt>,欢迎访问996工作的李东洋的主页";
    Response response = new Response();
    response.str = "response";

    FilterChain filterChain = new FilterChain();
    filterChain.add(new HTMLFilter()).add(new SensitiveFilter());
    filterChain.doFilter(request,response);
    System.out.println(request.str);
    System.out.println(response.str);
  }
}
