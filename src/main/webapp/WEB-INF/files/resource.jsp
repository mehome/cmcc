<%--
  Created by IntelliJ IDEA.
  User: 唐学俊
  Date: 2018/1/31
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<HTML>
<HEAD><TITLE>中国移动业务管理系统</TITLE>
    <META http-equiv=Content-Type content="text/html; charset=gb2312">
    <META content="MSHTML 6.00.2600.0" name=GENERATOR>
    <link href="../../style.css" rel="stylesheet" type="text/css">
</HEAD>
<BODY bgColor=#ffffff leftMargin=0 topMargin=0 marginheight="0" marginwidth="0">
<CENTER>
    <TABLE cellSpacing=0 cellPadding=0 width=749 border=0>
        <TBODY>
        <TR>
            <TD width=173><A href="http://www.chinamobile.com/index.asp"><IMG
                    height=74 src="/images/logo.gif" width=173 border=0></A></TD>
            <TD vAlign=top align=right>
                <TABLE width="100%" border=0 cellPadding=0 cellSpacing=0>
                    <TBODY>
                    <TR bgColor=#2650a6>
                        <TD height="12"><img src="/images/spacer.gif" width="1" height="1"></TD>
                        <TD height="12"><img src="/images/spacer.gif" width="1" height="1"></TD>
                        <TD height="12"><img src="/images/spacer.gif" width="1" height="1"></TD>
                        <TD height="12"><img src="/images/spacer.gif" width="1" height="1"></TD>
                        <TD height="12"><img src="/images/spacer.gif" width="1" height="1"></TD>
                    </TR>
                    <TR bgColor=#FFFFFF>
                        <TD><img src="/images/spacer.gif" width="1" height="1"></TD>
                        <TD><img src="/images/spacer.gif" width="1" height="1"></TD>
                        <TD><img src="/images/spacer.gif" width="1" height="1"></TD>
                        <TD><img src="/images/spacer.gif" width="1" height="1"></TD>
                        <TD><img src="/images/spacer.gif" width="1" height="1"></TD>
                    </TR>
                    <TR>
                        <TD><img src="/images/pic01.gif" width="115" height="55"></TD>
                        <TD><img src="/images/pic04.gif" width="115" height="55"></TD>
                        <TD><img src="/images/pic03.gif" width="115" height="55"></TD>
                        <TD><img src="/images/pic02.gif" width="115" height="55"></TD>
                        <TD><img src="/images/pic05.gif" width="115" height="55"></TD>
                    </TR>
                    </TBODY>
                </TABLE>
            </TD>
        </TR>
        <TR>
            <TD height="12" colSpan=2 align=right bgColor=#d4dced>


                <img src="/images/spacer.gif" width="1" height="1">
                <TABLE cellSpacing=0 cellPadding=0 border=0>
                    <TBODY>
                    <TR>
                    </TR>
                    </TBODY>
                </TABLE>

            </TD>
        </TR>
        <TR>
            <TD colSpan=2><IMG height=2 src="/images/blank(1).gif" width=1></TD>
        </TR>
        </TBODY>
    </TABLE>
    <TABLE cellSpacing=0 cellPadding=0 width=749 border=0>
        <TBODY>
        <TR vAlign=top>
            <TD width=173 bgColor=#c9d3e9 rowSpan=2>
                <TABLE cellSpacing=0 cellPadding=0 width=173 border=0>
                    <TBODY>
                    <!--TR>
                      <TD width=11 height="29" bgColor=#2650a6><IMG height=1
                        src="/images/blank.gif" width=1 border=0><img src="/images/Arrow1.gif" width="23" height="23"></TD>
                      <TD width=165 height="29" bgColor=#7691c7>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A
                        class=nav
                        href="newOperator.htm">新增操作员</A></TD>
                    </TR>
                    <TR>
                      <TD bgColor=#ffffff colSpan=2><IMG height=1
                        src="/images/blank.gif" width=1 border=0></TD></TR>
                    <TR>
                      <TD width=11 bgColor=#2650a6><IMG height=1
                        src="/images/blank.gif" width=1 border=0><img src="/images/Arrow1.gif" width="23" height="23"></TD>
                      <TD width=165 height="29" bgColor=#7691c7>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A
                        class=nav
                        href="modifyOperator.htm">修改操作员</A></TD>
                    </TR-->
                    <TR>
                        <TD bgColor=#ffffff colSpan=2><IMG height=1
                                                           src="/images/blank.gif" width=1 border=0></TD>
                    </TR>
                    <TR>

                    </TR>
                    <TR>
                        <TD bgColor=#ffffff colSpan=2><IMG height=1
                                                           src="中国移动通信.files/blank.gif" width=1 border=0></TD>
                    </TR>
                    <TR>
                        <TD width=11 bgColor=#2650a6><IMG height=1
                                                          src="/images/blank.gif" width=1 border=0><img
                                src="/images/Arrow1.gif" width="23" height="23"></TD>
                        <TD width=165 height="29" bgColor=#7691c7>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A
                                class=nav href="${pageContext.request.contextPath}/resource/loadSectionNoType.action">资源管理</A></TD>
                    </TR>
                    <TR>
                        <TD bgColor=#ffffff colSpan=2><IMG height=1
                                                           src="/images/blank.gif" width=1 border=0></TD>
                    </TR>
                    <TR>
                        <TD width=11 bgColor=#2650a6><IMG height=1
                                                          src="/images/blank.gif" width=1 border=0><img
                                src="/images/Arrow1.gif" width="23" height="23"></TD>
                        <TD width=165 height="29" bgColor=#7691c7>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A
                                class=nav
                                href="${pageContext.request.contextPath}/allocate/enterCharge.action">配置业务费用</A></TD>
                    </TR>
                    <TR>
                        <TD bgColor=#ffffff colSpan=2><IMG height=1
                                                           src="/images/blank.gif" width=1 border=0></TD>
                    </TR>
                    <TR>
                        <!--TD width=11 bgColor=#2650a6><IMG height=1
                          src="/images/blank.gif" width=1 border=0><img src="/images/Arrow1.gif" width="23" height="23"></TD>
                        <TD width=165 height="29" bgColor=#7691c7>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A
                          class=nav
                          href="#"></A></TD-->
                    </TR>
                    <TR>
                        <TD bgColor=#ffffff colSpan=2><IMG height=1
                                                           src="/images/blank.gif" width=1 border=0></TD>
                    </TR>
                    <TR>
                        <TD width=11 bgColor=#2650a6><IMG height=1
                                                          src="/images/blank.gif" width=1 border=0><img
                                src="/images/Arrow1.gif" width="23" height="23"></TD>
                        <TD width=165 height="29" bgColor=#7691c7>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A
                                class=nav
                                href="${pageContext.request.contextPath}/customer/findIdentify.action">开户</A></TD>
                    </TR>
                    <TR>
                        <TD bgColor=#ffffff colSpan=2><IMG height=1
                                                           src="/images/blank.gif" width=1 border=0></TD>
                    </TR>
                    <!--TR>
                      <TD width=11 bgColor=#2650a6><IMG height=1
                        src="/images/blank.gif" width=1 border=0><img src="/images/Arrow1.gif" width="23" height="23"></TD>
                      <TD width=165 height="29" bgColor=#7691c7>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A
                        class=nav
                        href="newUser.htm">录入用户信息</A></TD>
                    </TR>
                    <TR>
                      <TD bgColor=#ffffff colSpan=2><IMG height=1
                        src="/images/blank.gif" width=1 border=0></TD></TR>
                    <TR>
                      <TD width=11 bgColor=#2650a6><IMG height=1
                        src="/images/blank.gif" width=1 border=0><img src="/images/Arrow1.gif" width="23" height="23"></TD>
                      <TD width=165 height="29" bgColor=#7691c7>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A
                        class=nav
                        href="newAccount.htm">录入账户信息</A></TD>
                    </TR-->

                    <TR>
                        <TD bgColor=#ffffff colSpan=2><IMG height=1
                                                           src="/images/blank.gif" width=1 border=0></TD>
                    </TR>
                    <TR>

                    </TR>
                    <TR>
                        <TD bgColor=#ffffff colSpan=2><IMG height=1
                                                           src="/images/blank.gif" width=1 border=0></TD>
                    </TR>
                    <TR>
                        <TD width=11 bgColor=#2650a6><IMG height=1
                                                          src="/images/blank.gif" width=1 border=0><img
                                src="/images/Arrow1.gif" width="23" height="23"></TD>
                        <TD width=165 height="29" bgColor=#7691c7>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A
                                class=nav
                                href="${pageContext.request.contextPath}/logOut.action">退出</A></TD>
                    </TR>
                    <TR>
                        <TD bgColor=#ffffff colSpan=2><IMG height=1
                                                           src="/images/blank.gif" width=1 border=0></TD>
                    </TR>

                    <TR align=middle>
                        <TD colSpan=2 height=160>&nbsp;</TD>
                    </TR>
                    <TR>
                        <TD colSpan=2><IMG height=1 src="/images/blank.gif"
                                           width=1></TD>
                    </TR>
                    </TBODY>
                </TABLE>
            </TD>
            <TD width=2 rowSpan=3><IMG height=1 src="/images\blank(1).gif" width=2></TD>
            <TD width="2">
                <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
                    <TBODY>
                    <TR>
                        <TD height=25>&nbsp;您现在的位置：资源管理</TD>
                    </TR>
                    <TR>
                        <TD bgColor=#2650a6><IMG height=1 src="/images\blank(1).gif"
                                                 width=1></TD>
                    </TR>
                    <TR>
                        <TD><IMG height=2 src="/images/lank(1).gif" width=574></TD>
                    </TR>
                    </TBODY>
                </TABLE>
            </TD>
        </TR>
        <TR vAlign=top>
            <TD height="600" bgColor=#f1f3f9>

                <form method="POST" action="${pageContext.request.contextPath}/resource/addResource.action">
                    <p>号码类型：
                        <c:forEach items="${sectionNoTypeList}" var="type">
                        <input type="Radio" name="type.typeId"  value="${type.typeId}" checked>${type.typeName} &nbsp;&nbsp;
                    </c:forEach>
                    <p>指定号段：从<input type="text" name="beganSectionNo" size="20" value="13910000000">到<input type="text" name="endSectionNo"
                                                                                                size="20"
                                                                                                value="13912345678"><input
                            type="submit" value="提交" name="B1"><input type="reset" value="全部重写" name="B2"></p>
                </form>
                <hr>
            </TD>
        </TR>
        </TBODY>
    </TABLE>
    <BR></CENTER>
</BODY>
</HTML>
