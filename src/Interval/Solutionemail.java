package Interval;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 For example, in alice@leetcode.com, alice is the local name, and leetcode.com is the domain name.

 Besides lowercase letters, these emails may contain '.'s or '+'s.

 If you add periods ('.') between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name.  For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.  (Note that this rule does not apply for domain names.)

 If you add a plus ('+') in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered, for example m.y+name@email.com will be forwarded to my@email.com.  (Again, this rule does not apply for domain names.)

 It is possible to use both of these rules at the same time.

 Given a list of emails, we send one email to each address in the list.  How many different addresses actually receive mails?



 Example 1:

 Input: ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
 Output: 2
 Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails
 */
public class Solutionemail {

    public static void main(String[] args) {
        String[] emails = {"ihbumoogi+e@rbsvc.com",
                "n.j.ax.t.xcsoz+k@lo.xap.com",
                "x+x.a.w.c+z.e.u+m.y@fnsx.com",
                "fj.j.j.w+tv+g.ri@dvmqt.y.com",
                "fj.j.j.w+z.o.z.h.h@dvmqt.y.com",
                "dg.nru.bcsyw+d@nkynkj.ckq.com",
                "h.f.q.ns+tshpz@nn.r.com",
                "ihbumoogi+e@rbsvc.com",
                "s+l.dl.sft.vn.q@tqbxjqg.com",
                "zze.ovoqr+ds@cx.kahuobzk.com",
                "n.j.ax.t.xcsoz+y@lo.xap.com",
                "n.j.ax.t.xcsoz+c@lo.xap.com",
                "fj.j.j.w+z.ps.fp@dvmqt.y.com",
                "f.q+ibv.d.usw.s@sanzdu.com",
                "s+h+b+v.c+wv+jl+c@tqbxjqg.com",
                "fj.j.j.w+zr.yim@dvmqt.y.com",
                "x+hwywuxhys@fm.qeqlb.com",
                "o.rs+ik.h.s.d.fv@zpavzp.g.com",
                "n.j.ax.t.xcsoz+m@lo.xap.com",
                "e.pt.o.rn+a.uj.u@mqhs.com",
                "x+p+ad+rg+g+n+b+l@fm.qeqlb.com",
                "e.pt.o.rn+e.j.b+o@mqhs.com",
                "e.pt.o.rn+t.x.u+w@mqhs.com",
                "q+e.el.pbr.gkg@knryg.zpztb.com",
                "h.f.q.ns+z.mq+i+f@nn.r.com",
                "x+ou.x+n.fp+lp.t@fnsx.com",
                "ihbumoogi+c@rbsvc.com",
                "x+wv+pq+gyfq.g@fnsx.com",
                "x+mg.t.qg.toff@fm.qeqlb.com",
                "q+d.gzbzme.v+n@knryg.zpztb.com",
                "q+c.f.g.a.i.h.b+h.o@knryg.zpztb.com",
                "zze.ovoqr+yl@cx.kahuobzk.com",
                "ihbumoogi+p@rbsvc.com",
                "n.j.ax.t.xcsoz+e@lo.xap.com",
                "ihbumoogi+b@rbsvc.com",
                "dg.nru.bcsyw+e@nkynkj.ckq.com",
                "h.f.q.ns+f+pust@nn.r.com",
                "s+un.e.t.u.r.t.v.s@tqbxjqg.com",
                "s+l+nqqg.khwb@tqbxjqg.com",
                "fj.j.j.w+n.ggl.u@dvmqt.y.com",
                "n.j.ax.t.xcsoz+b@lo.xap.com",
                "o.rs+lb.z.z.ff.e@zpavzp.g.com",
                "x+vd+lm.a+ui+z.j@fm.qeqlb.com",
                "e.pt.o.rn+kocq@mqhs.com",
                "q+ugt+zzi.e+em@knryg.zpztb.com",
                "zze.ovoqr+nv@cx.kahuobzk.com",
                "zze.ovoqr+yt@cx.kahuobzk.com",
                "zze.ovoqr+fn@cx.kahuobzk.com",
                "f.q+e.d+j.x+b.p+g+s@sanzdu.com",
                "e.pt.o.rn+d.p.p+w@mqhs.com",
                "q+jtigu.e.h.ro@knryg.zpztb.com",
                "h.f.q.ns+rfu+qv@nn.r.com",
                "x+y.x.ki.h+i.lj+e@fm.qeqlb.com",
                "f.q+k.dl.myo.x+b@sanzdu.com",
                "zze.ovoqr+pq@cx.kahuobzk.com",
                "x+q.g.ln.e+e+f.b.v@fm.qeqlb.com",
                "fj.j.j.w+v.p+jo+u@dvmqt.y.com",
                "q+rhhbhnysj@knryg.zpztb.com",
                "fj.j.j.w+wkzvo@dvmqt.y.com",
                "h.f.q.ns+s.x+w+l+a@nn.r.com",
                "n.j.ax.t.xcsoz+v@lo.xap.com",
                "z.q.qs+ibb.q+b.h@gorofcn.com",
                "z.q.qs+x.mw.o+lw@gorofcn.com",
                "q+aca+cmy+f.q.a@knryg.zpztb.com",
                "n.j.ax.t.xcsoz+r@lo.xap.com",
                "z.q.qs+iafh.x+h@gorofcn.com",
                "x+o.fq.dd.d+h.yk@fnsx.com",
                "dg.nru.bcsyw+u@nkynkj.ckq.com",
                "h.f.q.ns+q.e.q.c+t@nn.r.com",
                "q+n.u.d.jm.jbx.v@knryg.zpztb.com",
                "gb.s.uuxow+ge@dmn.qt.com",
                "o.rs+t.mby.z+gv@zpavzp.g.com",
                "o.rs+al.j.k.v.a+h@zpavzp.g.com",
                "x+v+j.m+q.u+h.k+g+z@fnsx.com",
                "e.pt.o.rn+b.a.h.h@mqhs.com",
                "zze.ovoqr+z.m@cx.kahuobzk.com",
                "o.rs+v+z.z.w.p+hu@zpavzp.g.com",
                "e.pt.o.rn+kahp@mqhs.com",
                "fj.j.j.w+d+j.o.r+p@dvmqt.y.com",
                "o.rs+lmo.c+u.za@zpavzp.g.com",
                "x+d+h.xm.t.y+i+p+s@fm.qeqlb.com",
                "ab.dvi.g+z.etq@fu.p.com",
                "q+lnbfkjawq@knryg.zpztb.com",
                "xwlznirsxh+p@mzdvwed.com",
                "x+l.m.co.d+z.i.i.i@fm.qeqlb.com",
                "s+h.o.xep.j.ud+j@tqbxjqg.com",
                "x+gc.dss.k.d+r.m@fm.qeqlb.com",
                "zze.ovoqr+rr@cx.kahuobzk.com",
                "n.j.ax.t.xcsoz+m@lo.xap.com",
                "s+g.k.z+v.yq.y.z+r@tqbxjqg.com",
                "h.f.q.ns+y.f+r.y.w@nn.r.com",
                "z.q.qs+o.ek+n.q+j@gorofcn.com",
                "n.j.ax.t.xcsoz+q@lo.xap.com",
                "q+b.m.c+p.b.m+o.u.b@knryg.zpztb.com"};
        int result = new Solutionemail().numUniqueEmails(emails);
        System.out.println("Output: " + result);
    }


    public int numUniqueEmails(String[] emails) {
        List<String> localNameList = new ArrayList<>();
        for(String email: emails) {
            String localName = email.substring(0,email.indexOf("@"));
            String domainName = email.substring(email.indexOf("@")+1);

            localName= localName.substring(0,localName.indexOf("+")!=-1?localName.indexOf("+"):localName.length());
            localName= localName.replace(".","");

            if(!localNameList.contains(localName+"@"+domainName)) {
                System.out.println(email + "      :    "+ localName+"@"+domainName);
                localNameList.add(localName+"@"+domainName);
            }

        }

        return localNameList.size();
    }
}