import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Day21.start(new Scanner("root: pppw + sjmn\n" +
                "dbpl: 5\n" +
                "cczh: sllz + lgvd\n" +
                "zczc: 2\n" +
                "ptdq: humn - dvpt\n" +
                "dvpt: 3\n" +
                "lfqf: 4\n" +
                "humn: 5\n" +
                "ljgn: 2\n" +
                "sjmn: drzm * dbpl\n" +
                "sllz: 4\n" +
                "pppw: cczh / lfqf\n" +
                "lgvd: ljgn * ptdq\n" +
                "drzm: hmdt - zczc\n" +
                "hmdt: 32"));
        Day21.start(new Scanner("zfbd: 5\n" +
                "wnqf: pnwq * htpn\n" +
                "tdrp: wrpw * vvwp\n" +
                "clfw: rnzp * zvhb\n" +
                "gncs: 10\n" +
                "tlmm: 5\n" +
                "lslm: rbdz + tcvs\n" +
                "wgcp: twsp * ldnm\n" +
                "mhvf: 3\n" +
                "gsjw: 7\n" +
                "zjdb: zfwg + hlzh\n" +
                "drbt: 7\n" +
                "ncwt: 7\n" +
                "nsdv: czts * nlpw\n" +
                "mrgj: 3\n" +
                "pjcc: 1\n" +
                "lqrj: pnpq * msnb\n" +
                "jfrn: 3\n" +
                "zjqc: 3\n" +
                "rpnz: 4\n" +
                "btzp: dlpt / gsfg\n" +
                "jcfb: 5\n" +
                "fcjc: fpmd * lpll\n" +
                "wpmd: mjjf + hqrf\n" +
                "bgmt: cnbd + lrmc\n" +
                "fwzl: zsdn * fqjs\n" +
                "mwzp: svsg + tzgm\n" +
                "jglm: pwsp * bvmg\n" +
                "bght: 5\n" +
                "dlcc: fbzq * szlg\n" +
                "hlzh: gfwz * dlcd\n" +
                "pfpw: srwl * wlwr\n" +
                "drql: 8\n" +
                "wvls: 5\n" +
                "qzzm: dczl + ddpz\n" +
                "qslq: lgqj * nmdl\n" +
                "rhvw: 3\n" +
                "lcnj: 2\n" +
                "gblp: qblf * rqlf\n" +
                "bczw: zssh - rrsr\n" +
                "pblq: mvbt + gzpj\n" +
                "fmsz: 4\n" +
                "jjfb: vpgn * ztqq\n" +
                "ntgz: 3\n" +
                "rdrb: zmrl * wsrq\n" +
                "mppd: qsjp * szdm\n" +
                "bjss: qhdc * bgsc\n" +
                "dgsb: hsmc * gpbn\n" +
                "mmgq: 19\n" +
                "vfmn: flmm * dprg\n" +
                "dgtz: zslp + bwsz\n" +
                "cqwt: 3\n" +
                "hjpg: 3\n" +
                "pmqs: 15\n" +
                "jcqq: 4\n" +
                "gzcn: 3\n" +
                "qsdh: 3\n" +
                "ggwc: mfpf * lvgv\n" +
                "qdlh: 2\n" +
                "vpzr: 2\n" +
                "bpfv: 10\n" +
                "qwwm: 1\n" +
                "flph: nrcn * smcv\n" +
                "cpzl: 3\n" +
                "wdzn: gdtc - hczr\n" +
                "tbmp: 8\n" +
                "bggp: rjtz + jjfn\n" +
                "gspd: 4\n" +
                "wstv: 20\n" +
                "hnzd: 3\n" +
                "mbbl: gsdl * cfjw\n" +
                "zjsw: 5\n" +
                "llcz: 5\n" +
                "wnrj: pltj + vvhn\n" +
                "wvhn: 2\n" +
                "gdwp: ghlq * hlhs\n" +
                "bsnf: hdqn * mqjq\n" +
                "rvsm: 2\n" +
                "qjcl: fnbl + qshl\n" +
                "qrhr: lsdw / hhsg\n" +
                "frvm: 1\n" +
                "lqpq: 5\n" +
                "jfpl: wzbj * sdbq\n" +
                "prfr: 2\n" +
                "vpgn: pszd * tcfg\n" +
                "swqv: 2\n" +
                "hqgh: 15\n" +
                "rdvm: rcmw * hnzd\n" +
                "bbmb: rjgz * mqgr\n" +
                "bscv: 3\n" +
                "zfsh: 2\n" +
                "lbzm: 4\n" +
                "wwgb: 4\n" +
                "zcgg: njmq * gvmg\n" +
                "njgl: 3\n" +
                "gvfn: 12\n" +
                "hjpw: 8\n" +
                "gblz: jjgj - vzld\n" +
                "fzfp: 5\n" +
                "gvtz: 6\n" +
                "ssdf: zzcw - tlmt\n" +
                "fgjh: 14\n" +
                "bttj: smlh * gtzh\n" +
                "wltg: wfcv * vqsw\n" +
                "gcrr: srqs / rdtb\n" +
                "shvd: zfsh + dhdq\n" +
                "fdzr: zvvp * rsfc\n" +
                "wjwc: ncbv * wqnq\n" +
                "vpds: 11\n" +
                "jcmg: 2\n" +
                "cbsd: pzlz + zsqs\n" +
                "ztpf: 9\n" +
                "dgsg: 20\n" +
                "tcvs: drbt + ggjn\n" +
                "dlqw: mwsf * rqll\n" +
                "bfms: 5\n" +
                "fhrh: vwgf + nrvh\n" +
                "cbhr: 3\n" +
                "rhmn: fllz + vcvw\n" +
                "zgbm: 2\n" +
                "qqzm: 6\n" +
                "tddl: lzdj + qrjw\n" +
                "bwwp: 10\n" +
                "vmqr: 5\n" +
                "frlr: tgtf * bszs\n" +
                "jdll: zbnv / hwnh\n" +
                "jvrg: hqfn - jmcs\n" +
                "cjss: 4\n" +
                "bjsc: 3\n" +
                "zqcm: gcqn * lzwr\n" +
                "cldl: gtvj + ndqt\n" +
                "fpbw: 3\n" +
                "cfbt: 2\n" +
                "rdhn: 3\n" +
                "zrdp: fcpp + wdnj\n" +
                "mzjn: nwjd + zrdp\n" +
                "vhld: 3\n" +
                "ccrm: 3\n" +
                "wdnj: jmct + mjvl\n" +
                "zcsz: qpbr * rvsm\n" +
                "jzbq: ccgc - wldt\n" +
                "nglc: zlsz * gbll\n" +
                "tzqw: stqf * zffp\n" +
                "gcnj: 3\n" +
                "shrq: hbfm * bbpj\n" +
                "cldj: 4\n" +
                "nqwp: jmgc + pfnf\n" +
                "hctq: 2\n" +
                "hbfm: 3\n" +
                "wqpn: hrsr + qlzj\n" +
                "fjfd: vdzg * pflw\n" +
                "fqjs: 14\n" +
                "tjwn: 13\n" +
                "tqmc: 3\n" +
                "lbzg: 4\n" +
                "zhds: qqzm * tptb\n" +
                "cspt: chsr - bfms\n" +
                "jvnl: qjrd + shrq\n" +
                "dvnq: jbdw * pprv\n" +
                "jqgc: 2\n" +
                "dmgj: 3\n" +
                "sprr: 13\n" +
                "zhfn: 1\n" +
                "cwlg: wrhr / cwwv\n" +
                "whql: 18\n" +
                "vtml: 1\n" +
                "lgjj: rjpt + hsdq\n" +
                "mlmd: hqwm * ftqb\n" +
                "vsdb: qfqf * rmlc\n" +
                "vnwm: ctbl + msmc\n" +
                "sdbq: 2\n" +
                "rrmb: jwgh + ppbs\n" +
                "rcmw: 3\n" +
                "dcqb: hhjf * zwvf\n" +
                "lcdl: 9\n" +
                "crww: nchh * cfbt\n" +
                "twzt: jzdb * vzwd\n" +
                "jdft: 2\n" +
                "mbsl: 2\n" +
                "hnrf: rjhg + lffp\n" +
                "tgpl: 2\n" +
                "hbbd: 12\n" +
                "czfn: dczc * bztw\n" +
                "vznj: 3\n" +
                "sbhl: 5\n" +
                "zlvf: tgjz * sjvt\n" +
                "fbms: 17\n" +
                "jgfp: zspf + tpgj\n" +
                "gbqq: pwsb * lnft\n" +
                "gzmg: jjnq / bggz\n" +
                "mznj: 3\n" +
                "dwcn: mwqf + qtdf\n" +
                "rczp: czfb * lvwq\n" +
                "hmrp: cjvp * rqvt\n" +
                "fswg: zvzq * tggd\n" +
                "rhmq: lvnt * lpbb\n" +
                "zchp: djln + jmsv\n" +
                "lmpb: jmqh * lthd\n" +
                "wmwm: fpnj + bbmb\n" +
                "rnfn: 2\n" +
                "hdpd: bdwr + qsff\n" +
                "zvhb: 2\n" +
                "zbhc: 7\n" +
                "qlnv: 5\n" +
                "fwlb: 2\n" +
                "zhjv: dzlh + bplp\n" +
                "wlqn: jgdz * phtr\n" +
                "ssrb: whth * gzjf\n" +
                "twmg: pzgm + rlmj\n" +
                "dwns: 2\n" +
                "bvjv: wbcl + nqdh\n" +
                "bggz: 2\n" +
                "vdzg: 3\n" +
                "vphr: 3\n" +
                "chrl: zqvz * jcws\n" +
                "jsts: 5\n" +
                "zpsn: 2\n" +
                "gsdl: dlrb * nbtg\n" +
                "lhng: 8\n" +
                "tmqc: dhhg / gjsf\n" +
                "gfwz: vwqt + drdl\n" +
                "zvzq: 5\n" +
                "qsvf: wgvp * dswc\n" +
                "qlnp: 3\n" +
                "lvmq: 11\n" +
                "rznh: 2\n" +
                "tjdv: swfw * hnrf\n" +
                "wzmj: 9\n" +
                "rzvz: fbdb * qdvz\n" +
                "zrzf: 3\n" +
                "tzsc: 2\n" +
                "zvhf: 2\n" +
                "qfss: jdtm * szzm\n" +
                "gjjt: 3\n" +
                "tlds: 5\n" +
                "tfsr: 5\n" +
                "swdd: drgg + hgwm\n" +
                "sttj: zvts * cwcj\n" +
                "qfjq: ztmq + bjss\n" +
                "crhc: rpmg * gcnj\n" +
                "sssh: lzvd * swdd\n" +
                "zmdb: bzpc * gfqb\n" +
                "qptl: 6\n" +
                "trvm: 2\n" +
                "prrq: 3\n" +
                "ghmh: 16\n" +
                "rntv: ftfb * vgdb\n" +
                "gjhh: vlzz * fpfm\n" +
                "mptc: 2\n" +
                "tlvg: 14\n" +
                "mlgw: twqw * cfzv\n" +
                "vghn: 2\n" +
                "wbql: 4\n" +
                "vgwt: 5\n" +
                "cjvp: 2\n" +
                "nvcl: 4\n" +
                "dqzs: 3\n" +
                "jmqh: 3\n" +
                "zcbq: 3\n" +
                "bmrb: tqnm / vlgf\n" +
                "nqcn: dtgf * mnsq\n" +
                "fgjs: 5\n" +
                "bvlc: 7\n" +
                "hcwt: 1\n" +
                "wzcf: rtzn + lfff\n" +
                "whgs: 3\n" +
                "szzb: 2\n" +
                "hgwv: 3\n" +
                "qczn: 2\n" +
                "gvrr: 2\n" +
                "swws: snpf + dmzq\n" +
                "cmpp: snqf * llcz\n" +
                "mlrd: 3\n" +
                "nrbd: 2\n" +
                "mmbr: nllh * lcnj\n" +
                "pzqz: vqjj - bzmg\n" +
                "mvtj: flqt - szgn\n" +
                "hhcj: 6\n" +
                "mptn: 2\n" +
                "crwj: 15\n" +
                "tpgj: svzb * hnlh\n" +
                "qdfb: 13\n" +
                "wqdr: tjtl + jcdh\n" +
                "pdrl: gzpt * pjhw\n" +
                "cztj: ztml * nbnh\n" +
                "jsgs: flhf + dwmv\n" +
                "pnmf: 2\n" +
                "gvtv: 7\n" +
                "vdvh: 4\n" +
                "frvq: jtlv + lhvw\n" +
                "dfdz: tzqw + lhhp\n" +
                "qrqg: zhjv * hdhc\n" +
                "cmvf: rphw * gzcn\n" +
                "njmq: tqrc / nwvg\n" +
                "nhsv: qrss + vmsm\n" +
                "jmcq: 13\n" +
                "fbsc: 2\n" +
                "qstp: 4\n" +
                "rpst: 4\n" +
                "pnwq: 13\n" +
                "htvv: wscf + pdbj\n" +
                "zlpd: 15\n" +
                "wgjc: 3\n" +
                "wtbj: 7\n" +
                "crjq: pddq * nzcz\n" +
                "cppw: bsnd * lgmg\n" +
                "nmpb: 3\n" +
                "pgbp: pwll - ccsd\n" +
                "gftq: 10\n" +
                "mlzd: 4\n" +
                "stnz: 5\n" +
                "gpnl: 5\n" +
                "bnsd: qhmm * fvbd\n" +
                "tvdl: 18\n" +
                "srwl: 2\n" +
                "zjbq: rcrb * wsbj\n" +
                "qzdj: 7\n" +
                "zlvv: 10\n" +
                "jzcb: 8\n" +
                "psjj: ndjc + zpdb\n" +
                "cwgq: zvbw - zdjr\n" +
                "sbst: 2\n" +
                "bgsc: wrnz + mmgq\n" +
                "stqq: hmrp + gzlb\n" +
                "jnzj: 2\n" +
                "wvzb: mlds / cpbv\n" +
                "nfvh: tvwg * psll\n" +
                "wvpd: 5\n" +
                "zphm: 2\n" +
                "jrsq: dqzs * fnjv\n" +
                "hhjq: hfgw - lnsn\n" +
                "hqwm: 11\n" +
                "vsfv: grfv + vlcb\n" +
                "fmsp: 1\n" +
                "rqdl: 2\n" +
                "shfs: 5\n" +
                "ltln: 2\n" +
                "pcss: 3\n" +
                "frth: qcwm + plbb\n" +
                "ggtb: tcqm * jwcp\n" +
                "hhmp: fgnd + nmtw\n" +
                "qpls: 14\n" +
                "dvvc: 6\n" +
                "tjvp: bzsv + vmvr\n" +
                "mmlv: 4\n" +
                "ncbv: 5\n" +
                "gcpj: qdvq * dbpr\n" +
                "gllb: 9\n" +
                "wpbp: 6\n" +
                "bwmh: htnl / lbft\n" +
                "lfgc: 4\n" +
                "qmqn: 14\n" +
                "gqbr: 11\n" +
                "vlhc: 2\n" +
                "lbhq: fcgv - mffn\n" +
                "plrj: btzp - zhcc\n" +
                "ccgc: gdvv / vdwn\n" +
                "fqjh: cdff + rgql\n" +
                "qdvj: 17\n" +
                "zzdd: jths * ccbw\n" +
                "wzhw: rszl * lrwt\n" +
                "bqsq: dhsn + twwz\n" +
                "dlft: 7\n" +
                "mbjm: brnv / mpnh\n" +
                "vltn: pshj / slzj\n" +
                "gzqg: 2\n" +
                "wplp: vjnq - sbrz\n" +
                "vbqv: fvwq + bpfv\n" +
                "vdlq: fzbl + tpzc\n" +
                "jmbr: zhmm + lgnp\n" +
                "gjpc: 5\n" +
                "hnsm: 4\n" +
                "ppvn: 8\n" +
                "lvlc: qhzc * thnj\n" +
                "drlm: 2\n" +
                "ntcp: 2\n" +
                "jths: zhdd / hdmh\n" +
                "jnqb: 4\n" +
                "dbpr: 3\n" +
                "bftw: 2\n" +
                "dtzp: 3\n" +
                "bpfr: dwns + bzqz\n" +
                "pjlc: sprr * mddr\n" +
                "spjj: 17\n" +
                "tphs: rnmz - zscq\n" +
                "qzwh: blmb + mbcq\n" +
                "nwmb: lqzq * glgf\n" +
                "psll: hwrr + hrlm\n" +
                "rzrj: 1\n" +
                "rjgz: qslq + qnsh\n" +
                "zdvg: 2\n" +
                "fvtf: 11\n" +
                "rjbd: grhh + wnwp\n" +
                "lqjq: 3\n" +
                "cqbw: zvdt * sjvr\n" +
                "hzff: 14\n" +
                "pmbn: 5\n" +
                "dqwz: sdfv * wchv\n" +
                "crql: ffbf * hpjf\n" +
                "jssv: 2\n" +
                "mfhw: dwrh * jcfb\n" +
                "bwnr: 2\n" +
                "mwqj: zhfn + ddrr\n" +
                "pzgz: czdw + ftzh\n" +
                "gcpn: 6\n" +
                "rvpf: bnlv * mztq\n" +
                "nqsm: 5\n" +
                "mvdw: 3\n" +
                "gzpt: bpng + zbhj\n" +
                "hzdf: 16\n" +
                "wwsc: 20\n" +
                "trwg: pbcf * mgdr\n" +
                "zhcp: cgss * ltln\n" +
                "pnwj: 10\n" +
                "rrsr: 1\n" +
                "sprw: 8\n" +
                "rqgq: 2\n" +
                "pbvt: 12\n" +
                "jbqn: 2\n" +
                "jwvm: rdnm * zrzf\n" +
                "hqcm: drhl + msbw\n" +
                "pbcf: jtgj + hrlh\n" +
                "gqqz: 2\n" +
                "flrh: 3\n" +
                "fbrb: jjrn + bjnh\n" +
                "grmh: nbnm * wnfn\n" +
                "rdtb: 3\n" +
                "fvbd: 3\n" +
                "pvmh: cvwd / vghn\n" +
                "lfqg: lqzj + lmvh\n" +
                "lrwt: fswg - rfcn\n" +
                "jbbh: jcvj + ppgt\n" +
                "nvwd: 2\n" +
                "bghm: 2\n" +
                "pjpp: mbwv + lnls\n" +
                "jlmg: swwd * vncb\n" +
                "zvhd: njqv + rwgh\n" +
                "hswj: bbdf + ghch\n" +
                "szzm: nbdt + bsnf\n" +
                "lhns: 2\n" +
                "cvbw: jpjq + jwqm\n" +
                "cmhv: 5\n" +
                "nbnh: mqrb * bsrr\n" +
                "sqjd: vbnq * ssdf\n" +
                "zvdw: sznf + bgmt\n" +
                "snfw: 2\n" +
                "qtzr: pglg + fbqp\n" +
                "ngwd: gtcv + lljb\n" +
                "nbrq: 5\n" +
                "dtdb: sprp * zgnq\n" +
                "jsvj: 2\n" +
                "wfzl: qsbm + qpcj\n" +
                "zcpp: zglf * qfpw\n" +
                "mjqf: jgsd * bchm\n" +
                "fmtc: 2\n" +
                "ctwj: 3\n" +
                "zrnm: 3\n" +
                "ttwb: pqvj * rcdw\n" +
                "szsl: 5\n" +
                "qdsj: pnfg * fvqb\n" +
                "zmjn: wsvh + vtml\n" +
                "llbb: dnnv * wspz\n" +
                "wfzd: 2\n" +
                "blpd: 8\n" +
                "rrzs: jzfv * vsjs\n" +
                "prht: 6\n" +
                "vlgf: 2\n" +
                "jwqm: gbqq + hwjh\n" +
                "lvlh: jmwn * zcgg\n" +
                "gtcc: qvct - sndn\n" +
                "rcmn: brpv + lrbb\n" +
                "tjcv: zjqm * hmhc\n" +
                "bsmw: mqrl - gbhf\n" +
                "ddnd: ghdc * tdrp\n" +
                "bhcd: gsgd + lslm\n" +
                "shln: 4\n" +
                "rldv: gbwq * qzhl\n" +
                "plbb: 16\n" +
                "qsfs: 3\n" +
                "fdrr: ljtz * jrcj\n" +
                "wrwq: 5\n" +
                "cwpz: vhbf * ztbz\n" +
                "glcc: 3\n" +
                "vwbf: 17\n" +
                "htmn: whgs * ppvn\n" +
                "fwtt: 4\n" +
                "hdng: gbsh + sclr\n" +
                "lmjl: lrmt / nmpb\n" +
                "vmrr: tlqc * ntmn\n" +
                "srss: 3\n" +
                "vrtq: 4\n" +
                "wdnt: bwsc * mlbb\n" +
                "zlnf: 2\n" +
                "wpmr: 7\n" +
                "wtdz: vczs * vncp\n" +
                "swwd: 2\n" +
                "tcfm: 18\n" +
                "vlml: 5\n" +
                "jldt: jrvv + lgdd\n" +
                "vswl: 3\n" +
                "qslr: nrbd * qtsn\n" +
                "rlwh: crql - bzlj\n" +
                "vbsj: wzfm * gfvz\n" +
                "zpcr: 7\n" +
                "jzdl: fmrp - vfsb\n" +
                "gcch: 4\n" +
                "fszl: vpdp * wlhh\n" +
                "wwrl: qslr + nzgn\n" +
                "qhzh: 13\n" +
                "wwrp: 17\n" +
                "nncc: jbls + rfvt\n" +
                "qhvd: zngg - cnwd\n" +
                "ptsn: 1\n" +
                "scsf: ftvm * tlgj\n" +
                "lfbh: gqwm + twbm\n" +
                "gtvj: 14\n" +
                "hzwh: 2\n" +
                "hzpz: 5\n" +
                "fvwq: 1\n" +
                "chbs: 2\n" +
                "ftmj: wgpn * vcsf\n" +
                "lfzb: 2\n" +
                "tsbv: bthm + mdrt\n" +
                "wfgw: 2\n" +
                "btdn: 5\n" +
                "jztc: tdbp + ghzr\n" +
                "ncld: 7\n" +
                "gjsf: 2\n" +
                "wsjn: tlqt / gvrr\n" +
                "vzld: 2\n" +
                "dvhb: 5\n" +
                "grsc: mqgl * qlnv\n" +
                "dhdq: grbp - grmh\n" +
                "bhvz: qbbc / ldhd\n" +
                "zgqc: 5\n" +
                "tmcf: 7\n" +
                "zfwg: clfw * dglt\n" +
                "bwsz: 6\n" +
                "dwmv: bsfb + dsnd\n" +
                "fvpb: 3\n" +
                "zcvc: dcfv * jcnh\n" +
                "cndv: 5\n" +
                "tcfg: 3\n" +
                "zslp: 1\n" +
                "drjr: 3\n" +
                "wnjb: 3\n" +
                "rrrc: mvpd * jctj\n" +
                "fgvn: qtwv + gpvn\n" +
                "dzcv: wbmj * rzhr\n" +
                "pzgm: fmct * wblf\n" +
                "tptb: 7\n" +
                "vccg: 4\n" +
                "lfcv: rsbr * cqjl\n" +
                "cbdr: mqdh + ggsf\n" +
                "fzpr: qwwm + nsmc\n" +
                "pbzn: 14\n" +
                "gbll: 5\n" +
                "rjhg: dhdm + pmgl\n" +
                "czfb: 10\n" +
                "vlcb: 5\n" +
                "lflc: 2\n" +
                "tqtw: thsv * ntgz\n" +
                "dvnt: 3\n" +
                "jjnq: jgrn * zjzb\n" +
                "nlgt: 9\n" +
                "vqsw: 12\n" +
                "dsnd: 4\n" +
                "vrfz: 2\n" +
                "zlps: 3\n" +
                "hvjh: 3\n" +
                "hbnc: 3\n" +
                "nzgj: sngd * wthh\n" +
                "smlz: 4\n" +
                "fgvc: nwwh * blpd\n" +
                "srtb: dcgm / zjtq\n" +
                "fptp: 8\n" +
                "wscf: njrb * dwrt\n" +
                "hrlm: rgqf * jcpt\n" +
                "btfq: cjzc * zsjn\n" +
                "rjzw: hvfp + zmql\n" +
                "brnv: bmpj * jgmh\n" +
                "wblf: htsb + httv\n" +
                "fcpv: 20\n" +
                "tfll: wbbj - vfmd\n" +
                "qwwv: 14\n" +
                "wfcv: hrjq - wgjc\n" +
                "hjmm: 2\n" +
                "nphn: sqsm + cnjf\n" +
                "psjz: 2\n" +
                "plrp: zjsw * hglg\n" +
                "pzvl: cchf * gwhl\n" +
                "hnnl: 7\n" +
                "hdcd: 19\n" +
                "gsfg: 2\n" +
                "swfv: wnbq * rqdl\n" +
                "dwdt: zccv + spmf\n" +
                "bfsh: 1\n" +
                "ztgd: 4\n" +
                "mzhn: qhcb * cbhf\n" +
                "gdgw: 4\n" +
                "bqln: qqcm + ddtg\n" +
                "brld: 2\n" +
                "mpzr: mgrw * tzbv\n" +
                "mtgf: 4\n" +
                "slpc: ntgr * tftb\n" +
                "mtcn: wstz * jcgl\n" +
                "qmwd: 5\n" +
                "csvq: 5\n" +
                "mqhd: mtqw + bdzf\n" +
                "lmmp: rjdw + bfdj\n" +
                "jwgh: wzsp + splm\n" +
                "qsnc: mwhr * pzqz\n" +
                "dntp: zrbt * wtqh\n" +
                "fbrw: rcmn + bnsd\n" +
                "rhgw: 2\n" +
                "hdqn: smgw + mvtj\n" +
                "hdmh: dmgj + pdmg\n" +
                "sdfh: sgrc - gfcz\n" +
                "fgvl: 6\n" +
                "dswc: 5\n" +
                "sdrr: 3\n" +
                "wtlb: 7\n" +
                "fgnd: wdzn * fghs\n" +
                "lhnb: pwbj * dvbm\n" +
                "zlsz: 19\n" +
                "nqrr: 7\n" +
                "zbdf: 13\n" +
                "frjd: ltws * hjpg\n" +
                "hmfc: 2\n" +
                "dnfn: 16\n" +
                "pptt: 5\n" +
                "zqcs: wcmm / sbst\n" +
                "vzbv: 4\n" +
                "zzrm: wrvs + bjdc\n" +
                "zwsw: vtvz + bdvp\n" +
                "cvnc: 5\n" +
                "dlcd: 7\n" +
                "nqbq: 2\n" +
                "hwwc: 1\n" +
                "nhhb: 5\n" +
                "blfw: ldmq + gmbp\n" +
                "phtr: 2\n" +
                "qmmq: vbzr + bwwp\n" +
                "rjjv: ltjt + jmhq\n" +
                "qffg: 4\n" +
                "wchv: 3\n" +
                "qccj: 7\n" +
                "vwsw: ntqf * sgqj\n" +
                "qnss: 2\n" +
                "jmtn: 1\n" +
                "mzts: mptn * stnz\n" +
                "pqvj: 4\n" +
                "fmqr: 3\n" +
                "hbqs: 4\n" +
                "nhww: bpmh + tqtw\n" +
                "vhbf: 2\n" +
                "tpgg: dcrr - mnvl\n" +
                "hqfn: 18\n" +
                "nqdz: jqpr / mtct\n" +
                "bgqr: 1\n" +
                "rbcd: 4\n" +
                "rszl: 2\n" +
                "vvvt: 3\n" +
                "hwrr: cllg + pcvg\n" +
                "ftzh: 5\n" +
                "ttbl: wctc + bgbt\n" +
                "jhbw: 2\n" +
                "rzgw: 3\n" +
                "zjgz: zqgz - fdls\n" +
                "mnbv: wpmd * fhqp\n" +
                "zglf: 3\n" +
                "lgdd: 1\n" +
                "hzss: gbrh * jnhg\n" +
                "mtcq: cbsd + fptp\n" +
                "ndzj: 5\n" +
                "qgdh: 2\n" +
                "tlqc: 2\n" +
                "dmgp: 13\n" +
                "hsjt: ggvj + wmpp\n" +
                "tvpw: stpq * pfsd\n" +
                "jjzr: 4\n" +
                "dlrt: 5\n" +
                "twwz: dnqf + dpwb\n" +
                "vnbc: 4\n" +
                "btdr: wjmw + mhvj\n" +
                "nmmp: 6\n" +
                "hbqh: 12\n" +
                "pdbj: zjdb + qhjj\n" +
                "tmmh: 3\n" +
                "shnt: rpgb + qrbp\n" +
                "qnfr: jvgw + vjww\n" +
                "wnbq: hrbz * qjcl\n" +
                "mtpn: 4\n" +
                "mfbj: nqwp / blcn\n" +
                "hlqj: 1\n" +
                "qjvn: 4\n" +
                "rgql: 4\n" +
                "ptsz: mnbv - zglh\n" +
                "bwfq: lqtn * qngl\n" +
                "vsnh: wmwq * nqbq\n" +
                "fhfr: 2\n" +
                "hsmc: pfpw / scpv\n" +
                "fscp: 6\n" +
                "wzcr: lbzg + zmnj\n" +
                "crdp: 2\n" +
                "fglh: jwdb + hcjr\n" +
                "dczc: hqlv * vptz\n" +
                "gdjj: glcc + dlvq\n" +
                "dgtv: 7\n" +
                "ljtz: 2\n" +
                "qsff: 7\n" +
                "rqfq: mqvf + fpjl\n" +
                "zbgn: mwtf - njgl\n" +
                "cmjv: mpgs - wpmw\n" +
                "ncnb: 13\n" +
                "nvwl: vbjb + sjlc\n" +
                "vplg: jdsp * qdgv\n" +
                "rslh: zpcr * nmbp\n" +
                "wpvf: hhmp / mptc\n" +
                "bdph: 3\n" +
                "qmcp: gmts + swhm\n" +
                "qngl: 4\n" +
                "rjpt: 3\n" +
                "zhdd: ddbn * wtlb\n" +
                "bqcd: 17\n" +
                "tzdc: 13\n" +
                "bftg: qpls + hmss\n" +
                "crnv: 17\n" +
                "bcwm: lvzt + llfc\n" +
                "prdr: 15\n" +
                "dvpv: hvth * pfzb\n" +
                "bdwr: cqfp * tczb\n" +
                "nljr: jllm / sltm\n" +
                "vqjj: fncj / lbzn\n" +
                "mpqh: 2\n" +
                "lnqs: 2\n" +
                "rpgb: 2\n" +
                "ffrr: psvv * wqdr\n" +
                "tmlf: 7\n" +
                "bvdn: dmdb + ljft\n" +
                "fzbn: 3\n" +
                "vrvv: nzfb - bjdt\n" +
                "pghh: 2\n" +
                "hbzt: 7\n" +
                "wtqh: 2\n" +
                "lznq: 14\n" +
                "mgrw: zwvl + nvcl\n" +
                "vqnl: 2\n" +
                "pprv: 2\n" +
                "vvcv: 3\n" +
                "lldb: qsnc * hzwh\n" +
                "lwgm: 2\n" +
                "zlrm: tgcg * rznh\n" +
                "mgmq: 3\n" +
                "wphc: lwbm + tgph\n" +
                "wlhh: 2\n" +
                "dmgd: 2\n" +
                "qvgj: 3\n" +
                "vptz: rnhf + qmzq\n" +
                "nqcl: 2\n" +
                "llwg: cztj - cgsd\n" +
                "jgdz: 3\n" +
                "vhfn: zcvc + rtmz\n" +
                "qhzc: pjsb + vwbn\n" +
                "gnnq: 3\n" +
                "fgmq: 3\n" +
                "fnbl: ztzs + pwfl\n" +
                "pflw: wbbz * hbqq\n" +
                "dzzq: zzjq + rcvn\n" +
                "lhhh: clpw * mbdl\n" +
                "trwt: lmjl - lwdt\n" +
                "nlfn: pzgj + jvrg\n" +
                "dvdl: lqwz * dcmr\n" +
                "lwtj: cbhr * lhfz\n" +
                "twfr: vvcm * stqq\n" +
                "hpsv: 3\n" +
                "wcmm: ttzz * zlhg\n" +
                "jcdh: 10\n" +
                "gtlr: 1\n" +
                "qvnw: 2\n" +
                "sjvr: 4\n" +
                "dwdw: lvwd - qshv\n" +
                "rngg: gblz * fmqr\n" +
                "dnzc: 2\n" +
                "wsvn: jhqj * grwr\n" +
                "sgqj: gcpn + qdvj\n" +
                "nllh: gjbh + vvgt\n" +
                "tnnw: 2\n" +
                "tqnm: jvct * nzpt\n" +
                "ppbc: lnqw + wmst\n" +
                "wwcm: 13\n" +
                "rchl: lhns * nclw\n" +
                "lvcp: 2\n" +
                "wpgn: 2\n" +
                "qncb: 8\n" +
                "csgs: brrd / qcwt\n" +
                "gsgd: cjtd * lmhj\n" +
                "qbdb: 2\n" +
                "jnhg: 7\n" +
                "nfmj: fbff + bmhl\n" +
                "cwwl: ctbp + ztpf\n" +
                "tqcj: nmww + cdvg\n" +
                "grwg: 3\n" +
                "mqpp: jwhv * rgmn\n" +
                "glmv: rfcr / gzrf\n" +
                "htsb: qhfc * fdrr\n" +
                "jmct: 1\n" +
                "qtcf: fdqt + gncl\n" +
                "mdvp: 2\n" +
                "jpdc: mzts * hqgh\n" +
                "dnqf: 1\n" +
                "rdfh: 5\n" +
                "ttzz: 2\n" +
                "btrt: 2\n" +
                "wbzr: qdht + mlzd\n" +
                "zdjr: 1\n" +
                "ggpb: hhqm * vmcw\n" +
                "wbmj: 2\n" +
                "dhhg: fglh * mphq\n" +
                "bnbw: zchp * rbjf\n" +
                "hczv: 2\n" +
                "wlfn: hhjq * ghdl\n" +
                "lgmg: 3\n" +
                "mrcb: mpdj * vnwm\n" +
                "rvzd: 20\n" +
                "qwct: rzbt * tqpq\n" +
                "gmqr: 7\n" +
                "nmbp: hlqj + rzsv\n" +
                "qhvp: 1\n" +
                "jdwp: 2\n" +
                "nszf: sssh * ndrv\n" +
                "jfvs: rhgh / zptw\n" +
                "gjcg: hswj - wfbd\n" +
                "rnsd: wntz / vrtq\n" +
                "lwqb: tcvt * slsc\n" +
                "zgph: qznj * fcfp\n" +
                "ffvr: 5\n" +
                "msmc: 2\n" +
                "qsmf: zcbq * gjjt\n" +
                "hhjr: 5\n" +
                "qdlt: 3\n" +
                "rvbn: fbrw / rzhn\n" +
                "pnwh: hpsv * pwrn\n" +
                "sbfh: flph * vpds\n" +
                "wfgr: 13\n" +
                "zvdl: zrlw + wrfw\n" +
                "fmhd: 12\n" +
                "wbvs: cspt + hnwt\n" +
                "zsvw: 5\n" +
                "ccpz: nbrq + wrwq\n" +
                "tghq: zlrl * dwtf\n" +
                "zfrl: 3\n" +
                "zlhg: gmqr + fddm\n" +
                "lpbj: 4\n" +
                "mcns: jlsf + vfmn\n" +
                "bjms: 8\n" +
                "hwvm: jtbl * mhqv\n" +
                "gdmj: qrwn * svjf\n" +
                "wjbf: lgzw * wpbp\n" +
                "zvnt: 4\n" +
                "qbcq: 2\n" +
                "fqhj: 3\n" +
                "tpwp: vncw * qbgw\n" +
                "msnb: dbgw * vvlf\n" +
                "smgw: bvlc * gllj\n" +
                "jrcj: 3\n" +
                "smlh: fpvp + wrzj\n" +
                "msqg: ccrm * nqsm\n" +
                "dhtz: fhrf - cbdr\n" +
                "qvvt: dlrt * lbgj\n" +
                "sjqz: pqnp + zntr\n" +
                "hpcd: tzsm * njjn\n" +
                "mgmd: 18\n" +
                "vjww: tpbz * hmgl\n" +
                "hhlq: 15\n" +
                "jspz: trwt * qsnh\n" +
                "jzfv: 4\n" +
                "cnwd: ltrl + fdzr\n" +
                "hppc: 3\n" +
                "vzvq: 4\n" +
                "qpcj: 5\n" +
                "bbpj: npnh * gczw\n" +
                "gmgn: 5\n" +
                "dcfv: ljfc + hdpf\n" +
                "rsfc: 2\n" +
                "nmth: gjrf * pnmf\n" +
                "bqht: 5\n" +
                "zhgq: psph + dwvv\n" +
                "sppf: zjpl * slfj\n" +
                "lzmt: 7\n" +
                "vwnm: 10\n" +
                "cjtd: rnfn * jfrn\n" +
                "tlnr: pdbg * qfqn\n" +
                "mbzb: 11\n" +
                "qlqd: zlps + vfhq\n" +
                "cdvg: 4\n" +
                "tqsq: 2\n" +
                "rjwz: 5\n" +
                "bplp: 6\n" +
                "hgdt: dsnr * mlrd\n" +
                "jlqc: vslg + zlwj\n" +
                "mpgf: 5\n" +
                "swhm: lhgz + rfrd\n" +
                "hglg: 5\n" +
                "vvbv: 5\n" +
                "phvl: 5\n" +
                "jtsq: qbgl * hjtb\n" +
                "gtfn: 11\n" +
                "tggc: 3\n" +
                "fbqp: jdsg * tpwp\n" +
                "vbjb: 1\n" +
                "dwmd: flnz + nqws\n" +
                "mjqj: 2\n" +
                "tvnr: jrjd * nqsh\n" +
                "nqvn: dplr * mfwc\n" +
                "brtb: sjdj * cwwl\n" +
                "bcfv: fppb * lwlw\n" +
                "nqws: dllh * nsqz\n" +
                "jddq: 2\n" +
                "sjvt: nldl * jrrz\n" +
                "hqvd: 12\n" +
                "zqbf: dgzr * qmbs\n" +
                "lrjw: lmmp * wpgn\n" +
                "qsqv: 7\n" +
                "vcbs: 3\n" +
                "fcpp: hgwv * vtsd\n" +
                "ttwg: 2\n" +
                "dnjt: 3\n" +
                "zzmc: qlsj * nbzn\n" +
                "dwvv: vfnq * bcbz\n" +
                "pjhw: 2\n" +
                "pfzb: 6\n" +
                "cpvn: 4\n" +
                "vrft: dvmw * zbdf\n" +
                "wpwc: mfbj * nvwd\n" +
                "jgmc: 2\n" +
                "djqd: 2\n" +
                "cglm: cwlg - crhc\n" +
                "qrlp: tjdq * hjzm\n" +
                "gfcz: cbtf + wsvn\n" +
                "dbsp: 2\n" +
                "dtsb: zwfr + zbww\n" +
                "cmwp: 2\n" +
                "hgwm: 10\n" +
                "wfmt: dvpq + ftmj\n" +
                "hnlh: 5\n" +
                "lsjt: crmb * mhpr\n" +
                "vtdm: shnt * vbbn\n" +
                "bzbp: vnrb + dlcc\n" +
                "nrlv: cvjs * qtcs\n" +
                "wnls: lhwc * twfr\n" +
                "rqcv: 17\n" +
                "fbff: rpnz * nhnz\n" +
                "qznj: ccdl + htrl\n" +
                "szdn: 10\n" +
                "dfbs: dzcv + mbvd\n" +
                "lpdw: 7\n" +
                "zptw: 4\n" +
                "hqlq: mjqj + vhdb\n" +
                "mvwc: 3\n" +
                "vjzb: qhfn + vplg\n" +
                "jvvm: 3\n" +
                "ltzz: rbmm * zbmw\n" +
                "qrbp: rllh + btfq\n" +
                "mztm: gmgn + mtgt\n" +
                "gddt: 2\n" +
                "nmph: 2\n" +
                "sgqt: 14\n" +
                "rhnj: 13\n" +
                "jwhv: 7\n" +
                "hnwt: wvzw + sqcs\n" +
                "bwll: frlr + wvsq\n" +
                "tlfw: 9\n" +
                "ntgr: 2\n" +
                "hhqm: 2\n" +
                "bslv: 5\n" +
                "llph: vmqr * srpb\n" +
                "qmzq: qczn * zmft\n" +
                "clcd: psjj + jsbf\n" +
                "lpll: 2\n" +
                "vmvh: 2\n" +
                "jqsc: vrvv / vwcq\n" +
                "zmdj: lmrn + clvb\n" +
                "bfcb: sjqz - rhmq\n" +
                "vcfv: 2\n" +
                "cbnj: 9\n" +
                "hftg: qvgj + cfww\n" +
                "dhdm: 8\n" +
                "qhwr: pcwt * hrwm\n" +
                "fhqz: fmdg * sppf\n" +
                "drdl: 2\n" +
                "jfvg: 12\n" +
                "psqq: 5\n" +
                "gpvn: rdrb + zdmq\n" +
                "mtsm: 3\n" +
                "lpqf: hpcd + frvh\n" +
                "shlw: vrsn + nbvq\n" +
                "clpw: 4\n" +
                "wwld: 2\n" +
                "bpmh: 4\n" +
                "dgvv: wvzb * nmph\n" +
                "dglt: pgrb * tljm\n" +
                "hbfh: 1\n" +
                "vlhh: lldb + vtpv\n" +
                "hndv: csgb + rlls\n" +
                "rzhn: 2\n" +
                "bmjf: 2\n" +
                "fncj: nwvs * jfnp\n" +
                "bfdj: vdqw * ttdg\n" +
                "dctp: lswz + lhng\n" +
                "jvlw: 2\n" +
                "tvtm: mqzr * ptrr\n" +
                "snpf: 5\n" +
                "drhl: vmft * pbvf\n" +
                "mjnw: 2\n" +
                "stfd: fbdf * tqmc\n" +
                "gzpj: 7\n" +
                "vlnb: 2\n" +
                "dcmr: 3\n" +
                "gbhf: gzbf + rbqm\n" +
                "lbzn: 8\n" +
                "ccjd: 2\n" +
                "fgtz: 3\n" +
                "hvmh: 2\n" +
                "fwtm: dmlf + gjqm\n" +
                "tlwc: mjpd + pzvl\n" +
                "vhmg: dtdz * cppd\n" +
                "dfmw: tgpl * jnwh\n" +
                "mjcv: pjsg - tsmw\n" +
                "sqds: svbl * pvws\n" +
                "gwhl: 2\n" +
                "pbtp: 5\n" +
                "djsp: 1\n" +
                "dllh: 2\n" +
                "fpvp: wgqs + ngwd\n" +
                "gczw: 2\n" +
                "lhcl: 4\n" +
                "pjts: fvns + wphc\n" +
                "qwrv: jbnp * pcqq\n" +
                "jcsw: spjj * cttp\n" +
                "bcpg: 11\n" +
                "vlzp: 6\n" +
                "qgpd: 1\n" +
                "rfcn: rbpl + vbqv\n" +
                "sfpn: fmtl * bfmp\n" +
                "dzpc: tttd * pcss\n" +
                "pdmg: 4\n" +
                "bhpf: nnbg * rthm\n" +
                "vncb: 5\n" +
                "jztj: 5\n" +
                "wsvh: rsqc * zbgn\n" +
                "hsnb: wztg - rvmc\n" +
                "hgtm: jddq * mjcv\n" +
                "hrcw: 3\n" +
                "sjlc: jvqj * lflc\n" +
                "gllj: 6\n" +
                "phmr: 3\n" +
                "sdcb: 5\n" +
                "jcws: wltg + cbtb\n" +
                "cblw: 2\n" +
                "svql: 5\n" +
                "vghb: jsvj + wpvn\n" +
                "gnzw: 3\n" +
                "pghb: jlqc + fgvc\n" +
                "fwwp: 3\n" +
                "ftjb: 3\n" +
                "rnhf: 11\n" +
                "nflw: jnzj + vsjr\n" +
                "wstz: vpzr * csgs\n" +
                "nbzn: dqjj + lwph\n" +
                "tttr: 3\n" +
                "bbmw: 1\n" +
                "fwhn: tpgg / wqpn\n" +
                "mlfw: 3\n" +
                "wrzm: rzbs + bjms\n" +
                "cbjv: 5\n" +
                "tlqt: zlrs * wplp\n" +
                "sqcs: 1\n" +
                "wlwr: lfmv + cjjr\n" +
                "lrqn: wpmr * mpnc\n" +
                "bbbn: vwzv + qbdb\n" +
                "wdvr: ffhd / wlpm\n" +
                "glbb: 12\n" +
                "dqdj: 19\n" +
                "mfln: 3\n" +
                "hgcv: 2\n" +
                "rpqg: mppr * hjmm\n" +
                "splm: wwwf - gcch\n" +
                "vfrl: ztdl - nldz\n" +
                "lfmv: 4\n" +
                "jhhd: 13\n" +
                "ggjn: 1\n" +
                "qtvl: 6\n" +
                "svvn: 2\n" +
                "vfhq: 3\n" +
                "fvqb: hvsr * szzb\n" +
                "stvr: 4\n" +
                "wrfw: 6\n" +
                "jnfc: vthr * wtbj\n" +
                "qfhs: hzss + dlbm\n" +
                "swjr: vwlc * jzbq\n" +
                "cbtf: dnfn + bwmh\n" +
                "ldhd: 2\n" +
                "glgf: 2\n" +
                "plpn: 3\n" +
                "qlzj: 1\n" +
                "hcsl: 2\n" +
                "lhhp: rhvw + mfbn\n" +
                "ccbw: 2\n" +
                "qbtp: 2\n" +
                "sqlt: hqgj / mjjc\n" +
                "gzlb: mlbn * thvv\n" +
                "svjf: 6\n" +
                "zmpr: jsjm * czpq\n" +
                "jllm: rvbn - zlpd\n" +
                "gjrf: 3\n" +
                "cpcn: vnpc * dqdj\n" +
                "nzgn: 15\n" +
                "qhfn: 12\n" +
                "znqv: rrzs + qrsd\n" +
                "blqz: 3\n" +
                "qqpn: gstv + sttj\n" +
                "nrww: bcwm + dffp\n" +
                "jjrn: vmvh * bhmp\n" +
                "tdvz: jbdb * mcns\n" +
                "fbwt: 2\n" +
                "mrzp: 5\n" +
                "thvv: 5\n" +
                "tghh: wbzr / lfgc\n" +
                "znhv: whvd * sbhl\n" +
                "sjhg: nrjh * vlnb\n" +
                "blts: 2\n" +
                "lvwd: szfc / dwdd\n" +
                "grwr: 3\n" +
                "tljm: 2\n" +
                "pbmp: zlwq * pchs\n" +
                "vbhz: mjqf * smjw\n" +
                "pdcb: nfct * whfg\n" +
                "mhvj: ncwt * jbbh\n" +
                "wrvs: 1\n" +
                "wmfc: zjpq / bmjf\n" +
                "cchf: 17\n" +
                "vncw: zgmv + prbm\n" +
                "dfmj: 2\n" +
                "mpmp: wfnc + chfp\n" +
                "fqtc: 5\n" +
                "rvmm: 5\n" +
                "gtzh: dlqw / cpvj\n" +
                "vtsd: 2\n" +
                "ghlq: 2\n" +
                "qbcm: ldng + dthb\n" +
                "pfwf: 10\n" +
                "dsnj: hprq * vzhd\n" +
                "ztjj: 13\n" +
                "mffn: gzlc * qjdf\n" +
                "ggzs: 7\n" +
                "pzvz: 14\n" +
                "gncl: sprw + lcdl\n" +
                "fvdn: gjpc * vptc\n" +
                "jddt: pjft * hdng\n" +
                "zwph: 3\n" +
                "zsdn: mpmp + znqf\n" +
                "mmnl: nrlv * jtsq\n" +
                "qvch: 6\n" +
                "rzhr: 3\n" +
                "njzv: 2\n" +
                "blhj: pscl * nhqn\n" +
                "rtlf: zqbw - rzvz\n" +
                "pjft: 5\n" +
                "lgqj: lvmq * qbtp\n" +
                "frvh: 1\n" +
                "tqls: pwhn + slpc\n" +
                "szpp: 2\n" +
                "tttd: wfzd * pjts\n" +
                "jptd: 4\n" +
                "jwdb: 2\n" +
                "rsbr: 3\n" +
                "ctbl: 11\n" +
                "pqfv: 20\n" +
                "zzpn: 2\n" +
                "dmdb: 2\n" +
                "vdgf: bhcd * srss\n" +
                "ldnm: 2\n" +
                "nsrr: fvfd * lnqs\n" +
                "phfc: 2\n" +
                "swbm: 2\n" +
                "ssnw: 20\n" +
                "fpvq: dzdn + vnln\n" +
                "hfgw: 13\n" +
                "jcbn: 2\n" +
                "dmss: 5\n" +
                "jlcd: 11\n" +
                "csgb: 1\n" +
                "jtsv: fwwp * rwzb\n" +
                "hdwq: vgdp - tsjm\n" +
                "bhlh: qmrz * sphz\n" +
                "frgb: 5\n" +
                "zdmq: 5\n" +
                "cjjr: 3\n" +
                "hzrq: dgtv + qmwd\n" +
                "dlvq: nvwl * vprv\n" +
                "mpdj: 14\n" +
                "ldjw: 2\n" +
                "bwtd: wwsc / zccn\n" +
                "cfww: 5\n" +
                "qlmc: 4\n" +
                "jmgc: fbrb + czfn\n" +
                "gjbh: fcpv + htmn\n" +
                "grfv: bnpf + frjd\n" +
                "wjrh: lvlh - fpfb\n" +
                "trch: 5\n" +
                "nbdt: dnss * dmnn\n" +
                "njqv: zjss + mgmq\n" +
                "vstd: 1\n" +
                "pfgb: tswm * vbhz\n" +
                "root: rnsd + vlzj\n" +
                "rwtl: 8\n" +
                "rbmm: 2\n" +
                "jcgl: 2\n" +
                "mbcq: 7\n" +
                "vnqs: vzns * llwg\n" +
                "ftfb: 4\n" +
                "nrcl: 2\n" +
                "ggsf: trnd * dphh\n" +
                "ppbs: jqjq * jptd\n" +
                "dwzm: wbvs + nhbc\n" +
                "jvct: sqwh + swlj\n" +
                "qtsn: cmpp + zvnt\n" +
                "gbrh: 12\n" +
                "dfcq: pzjm * psjz\n" +
                "dplr: hjnp * fqjh\n" +
                "zrlr: 5\n" +
                "qjwt: ggtb * qmmm\n" +
                "ldmq: 5\n" +
                "lqjf: gnwf * fbws\n" +
                "mqdh: vmrr + flqr\n" +
                "vwgf: 4\n" +
                "hnct: vnmp * mhjq\n" +
                "pzgj: pbcp + gzfc\n" +
                "lbft: 7\n" +
                "mvbd: hjvb + bzrr\n" +
                "bvsm: 3\n" +
                "hwsn: 7\n" +
                "znft: 8\n" +
                "vvrz: 19\n" +
                "jvrm: ldjw * mvvg\n" +
                "bsfb: 2\n" +
                "vmft: 8\n" +
                "bdzf: 10\n" +
                "rfpm: 5\n" +
                "ffhd: qqtl / drlm\n" +
                "hdsr: 3\n" +
                "qqdb: vbct * zqcp\n" +
                "qrfc: 2\n" +
                "zjbg: 6\n" +
                "hqvg: 5\n" +
                "qqwh: vqct * fwhn\n" +
                "djsj: 2\n" +
                "jrvv: 18\n" +
                "hctl: 3\n" +
                "cllg: wdnt * tjdv\n" +
                "hdbc: zgph + bwll\n" +
                "gvzw: vbsj * gvlv\n" +
                "schf: 14\n" +
                "hfwm: 3\n" +
                "dwrt: gjbn * jbcl\n" +
                "mqjq: 7\n" +
                "mgvz: 11\n" +
                "jjgm: 5\n" +
                "zcwd: 6\n" +
                "btpj: vmzr + mfrf\n" +
                "mdzv: 3\n" +
                "pcsg: wlgz * szhv\n" +
                "qdgv: 5\n" +
                "dnmb: vphr * cblw\n" +
                "bfmp: 3\n" +
                "dnpq: nmrw + qgpd\n" +
                "flqr: 3\n" +
                "jsdm: zjbh * lgjj\n" +
                "vcbb: pmwz * gjft\n" +
                "szgn: llph + pjlc\n" +
                "jsjm: lglc + frws\n" +
                "vdfq: rhfw * pjbd\n" +
                "vfnq: 2\n" +
                "mlds: vrlp + rslh\n" +
                "ssmj: tzsc * bvjv\n" +
                "spsd: 3\n" +
                "mfbn: 4\n" +
                "nzfb: gmwr * cdpz\n" +
                "dlbm: zmtb + gvzw\n" +
                "fcjw: bfcb / vhld\n" +
                "hlvz: vrfz * pzvz\n" +
                "vnpc: wlqn + gdjj\n" +
                "ctdj: ghmh - hrcw\n" +
                "lrbb: fzmt * fwpv\n" +
                "fdqt: 6\n" +
                "pjbd: lhnb / mcpp\n" +
                "mbdl: swbm + vfrl\n" +
                "hcvt: ltbd * bqfl\n" +
                "ltjt: 10\n" +
                "hrlh: 5\n" +
                "vmcw: 4\n" +
                "fpnj: jcbm + mjpv\n" +
                "wgrs: 3\n" +
                "bthm: 11\n" +
                "chlf: qgfh * tnnw\n" +
                "zsnz: qgmc + zmpr\n" +
                "flsp: jvtm + tcfm\n" +
                "vbnq: 3\n" +
                "wjnb: 14\n" +
                "czts: 3\n" +
                "qslv: qzwh * phfc\n" +
                "vnrb: szcp + bcwv\n" +
                "lwdt: mdvp * mwzp\n" +
                "qjrd: 13\n" +
                "dhzd: 10\n" +
                "hvgr: zjbq + fwlb\n" +
                "tnps: 7\n" +
                "fpmd: gnrs * zjqc\n" +
                "fdls: 3\n" +
                "lmhj: 2\n" +
                "qbgg: ghbb + qqpn\n" +
                "jgmh: ntdp * jcmg\n" +
                "nzpt: 2\n" +
                "vdlb: 8\n" +
                "gzrf: 2\n" +
                "cbrb: pmqs + rvzd\n" +
                "jttc: wlqr * jnmz\n" +
                "gvmg: 5\n" +
                "stpq: 2\n" +
                "fpzr: 3\n" +
                "bwpf: pghb * dblp\n" +
                "wvzw: tgcl * pvqc\n" +
                "bdbr: 12\n" +
                "ztmz: 2\n" +
                "vzmv: dgvv + wjwc\n" +
                "tjcm: bcpg * zzmh\n" +
                "scjl: 7\n" +
                "gcqn: wwld * qstp\n" +
                "hcpp: 1\n" +
                "tzbg: fccw * qsvf\n" +
                "wrhr: mlwj + bcbp\n" +
                "mnvl: cbtm * dtrv\n" +
                "cpqp: ffrr + glbb\n" +
                "qhzz: 9\n" +
                "ddpz: wvhf - lfqg\n" +
                "mhqv: dbnw + zvdl\n" +
                "wbcl: tjcm + cmsj\n" +
                "psms: 3\n" +
                "pczd: 4\n" +
                "cqzt: 4\n" +
                "lfff: mqtr + zqtq\n" +
                "svsn: 2\n" +
                "tppt: zrcm + sjhg\n" +
                "twqw: 2\n" +
                "jqsj: srgn + phsl\n" +
                "zdtq: frvm + dhpp\n" +
                "zngg: hjjq * hsnb\n" +
                "swzg: mzhn + cgbt\n" +
                "flhf: tmqf * fzpr\n" +
                "cbpg: 5\n" +
                "dbgl: 3\n" +
                "hbbs: 2\n" +
                "zjpq: bghm * mdbh\n" +
                "fddm: bglh - tnps\n" +
                "lglc: 15\n" +
                "pqdm: mrsv + cflr\n" +
                "slbz: 7\n" +
                "hdpf: hbbd - mvrd\n" +
                "stht: nwhz + cpqp\n" +
                "rmff: 7\n" +
                "rmrz: fhbq + ddpj\n" +
                "srgn: btht * sdrr\n" +
                "lhwc: gtfn + hzwz\n" +
                "fllz: hgtm + vtdm\n" +
                "tgjz: 2\n" +
                "wthh: 3\n" +
                "szdm: hwmr + ccpz\n" +
                "wzbj: 5\n" +
                "rwzb: 17\n" +
                "zzmh: 3\n" +
                "brrd: bbrp * qnss\n" +
                "wnwp: nfmj + bhht\n" +
                "rpdd: 5\n" +
                "mwhr: qlzm + wnjp\n" +
                "ztmc: 10\n" +
                "zpzm: grwg * vprf\n" +
                "lqsl: 5\n" +
                "clvc: qctc * csdn\n" +
                "nfct: grsc + tnnc\n" +
                "hwnh: 2\n" +
                "wntz: wffr + qrlp\n" +
                "rlmj: wgcp + bddg\n" +
                "jfbv: 2\n" +
                "fcdn: 2\n" +
                "pfnf: qdfb * ztjj\n" +
                "cdzz: 2\n" +
                "vhml: 5\n" +
                "wctq: 3\n" +
                "stcc: ngws - srnb\n" +
                "vwdh: 5\n" +
                "nccf: njtf + zlvv\n" +
                "mppr: 5\n" +
                "rgdc: 6\n" +
                "njjn: 2\n" +
                "dlpt: jjdh * dmgp\n" +
                "qsnh: 2\n" +
                "szqv: zhhd + nsnz\n" +
                "qcpw: sqcv + jvzt\n" +
                "tvwg: 3\n" +
                "jrth: 4\n" +
                "csmg: qjvn * lqjf\n" +
                "bdvp: htph * hjpw\n" +
                "lljb: gbtt - jlcd\n" +
                "tgcg: wzcf + bsmw\n" +
                "jmwd: 4\n" +
                "mpfg: 8\n" +
                "lpgr: ngvn + njfd\n" +
                "vzcw: fjhb + jnzl\n" +
                "mdnp: 4\n" +
                "zffp: vbwz * phvl\n" +
                "slfj: 2\n" +
                "pmwz: tphs + dzpc\n" +
                "qgmc: dtdb * hctl\n" +
                "blth: nlfn * vgzm\n" +
                "zjsm: 2\n" +
                "lhgz: cmjv * pslw\n" +
                "djjg: tlvg * spfq\n" +
                "vvcm: 2\n" +
                "wdmc: qlrt * nhhb\n" +
                "rcjt: 3\n" +
                "grrw: 3\n" +
                "cqfp: 2\n" +
                "rzfs: wfzl * sddm\n" +
                "nrvh: mmlz * wbfd\n" +
                "nsmc: tmmh * vcgj\n" +
                "hmss: brtb / sntq\n" +
                "zmnj: prht + lzmt\n" +
                "cpbv: 4\n" +
                "qnpd: pslg * zbnn\n" +
                "nbtg: nqcn - hbqh\n" +
                "qbsf: 5\n" +
                "ztml: nccf + wjbf\n" +
                "lclq: 13\n" +
                "qlrt: 5\n" +
                "gfqb: 6\n" +
                "dmfz: 8\n" +
                "wsgc: 5\n" +
                "zwvf: 2\n" +
                "mqrl: mtgc + vmzg\n" +
                "htpg: 2\n" +
                "ffhf: ztmc + bpnp\n" +
                "hnlm: 13\n" +
                "cvwd: nqbt - mhng\n" +
                "mmlz: 5\n" +
                "wcvd: 12\n" +
                "hcpn: 2\n" +
                "vhdb: djjw + dfbs\n" +
                "vncn: gsjt + mmbr\n" +
                "czsh: scsf - bjsc\n" +
                "mhjp: pqfv + vhfn\n" +
                "zndh: 9\n" +
                "sngd: 5\n" +
                "vvdn: 1\n" +
                "vggh: 1\n" +
                "qlgj: dlzb * rvmd\n" +
                "gnpg: cldj + dwtp\n" +
                "mddr: 3\n" +
                "dczl: rvpf / snfw\n" +
                "nlhj: 13\n" +
                "sznf: cgcc + jgbd\n" +
                "cmzl: wgrj * rdhn\n" +
                "bzqz: 5\n" +
                "dqjj: nnsh + flrh\n" +
                "psph: jnqb + nwmb\n" +
                "scsn: rpvj * gnnq\n" +
                "rlln: 6\n" +
                "csdn: cndv * bslv\n" +
                "hgdr: 11\n" +
                "dnrt: 4\n" +
                "cmwz: lbvt - rhmn\n" +
                "gwcp: 2\n" +
                "jpfz: mnfm * wfgr\n" +
                "gbwz: 2\n" +
                "vcnz: 5\n" +
                "ltss: rgdc + mbld\n" +
                "dmhw: lqrj + vvdn\n" +
                "lfdm: dtdv * mtcq\n" +
                "ldll: tptt * gvtv\n" +
                "jfls: cbwq / hftg\n" +
                "ghch: 12\n" +
                "hsls: jnfc + pnwh\n" +
                "dvmw: 2\n" +
                "zcbr: gdmj + tthw\n" +
                "qshl: wspv * lznq\n" +
                "rmzb: 3\n" +
                "vtps: 2\n" +
                "czpq: pcsg - cjss\n" +
                "nrcn: 2\n" +
                "qssn: 3\n" +
                "fvnb: qncb + rbts\n" +
                "wsvj: 11\n" +
                "ftvm: 4\n" +
                "nzjd: jqsc + ffdl\n" +
                "nldl: 3\n" +
                "fthh: wgrs * btzv\n" +
                "vbmh: 3\n" +
                "jbls: btrt + tlnr\n" +
                "cmsj: clcd * qwmg\n" +
                "blqj: wnql / sfsm\n" +
                "vprf: scsn - hsqm\n" +
                "gcvq: nhww * gvgr\n" +
                "cwvz: 2\n" +
                "dtdv: 2\n" +
                "mnsq: 7\n" +
                "vrsn: 5\n" +
                "llfc: 4\n" +
                "zbnv: gnzw * fcgr\n" +
                "dcqr: 2\n" +
                "gdds: 1\n" +
                "npfh: 4\n" +
                "vhjd: 10\n" +
                "brns: 3\n" +
                "wbbm: 2\n" +
                "spfq: 4\n" +
                "vsjs: 19\n" +
                "pwhq: vcrb + gdds\n" +
                "wnfn: 2\n" +
                "nqbt: cmwz / dnpq\n" +
                "wmdn: 3\n" +
                "mqqn: 2\n" +
                "bgtf: 17\n" +
                "hjwb: thnw + pnwj\n" +
                "wnrl: 4\n" +
                "znqf: csft * mtcn\n" +
                "zqtq: sznl * dcnv\n" +
                "jlml: qrfc * tjwn\n" +
                "tzbv: 2\n" +
                "hprq: jlln * ndtj\n" +
                "pszm: ldzg + lvqq\n" +
                "phsl: 3\n" +
                "zpvw: zpzm / mdzv\n" +
                "zwcs: 2\n" +
                "flhw: hnct + cggw\n" +
                "cggw: 10\n" +
                "lswz: 12\n" +
                "ddbn: ztgf / qvnw\n" +
                "mdrt: dqwz + slbz\n" +
                "plmc: ghdb + lmzg\n" +
                "ztdl: ffjf * zfrl\n" +
                "qngr: 4\n" +
                "lqsn: 5\n" +
                "jrrn: 3\n" +
                "lgcb: 3\n" +
                "dnzs: jwbd * psqq\n" +
                "mvrd: 3\n" +
                "lbgf: zmjn * jlwv\n" +
                "wpjj: qcnl * swcn\n" +
                "nhbc: vswl + bwtd\n" +
                "dfwj: frvw * rvmm\n" +
                "tzsm: 5\n" +
                "wgmp: rtpw * pdrl\n" +
                "cjcr: 2\n" +
                "pdvb: 6\n" +
                "wpll: rdvm + qgnm\n" +
                "fpjl: 18\n" +
                "pntb: qfhs * mtsm\n" +
                "bzlj: 2\n" +
                "hncs: msqg + zqzl\n" +
                "vjlg: rczp / rhgw\n" +
                "dprg: 5\n" +
                "fbdb: wbsb / nsdp\n" +
                "vhcs: 16\n" +
                "mwtf: qqdb + nljr\n" +
                "jnwh: 5\n" +
                "hjhf: 5\n" +
                "rwgv: nhhd + bvdn\n" +
                "rbbn: hzpz * svql\n" +
                "gmpg: 6\n" +
                "bddg: 3\n" +
                "hgld: 2\n" +
                "grjv: cdfc * qmqn\n" +
                "rrsb: rzfs - gspd\n" +
                "wnql: vcbs * hhcj\n" +
                "zvvp: fsbg + lfbh\n" +
                "vpph: 17\n" +
                "qsbm: 8\n" +
                "hjvb: 4\n" +
                "wjmw: fbtm * brns\n" +
                "gqwm: pvts * tzml\n" +
                "njfd: wpll * zgqc\n" +
                "hchs: 3\n" +
                "mpnc: 3\n" +
                "srpb: 3\n" +
                "dwnh: hqlq + bqln\n" +
                "pwfl: hwvm * zlnf\n" +
                "bwsc: 3\n" +
                "djln: pmjj * lfzb\n" +
                "wrpw: 4\n" +
                "gfvh: nwbd - fgbv\n" +
                "wgpn: 2\n" +
                "wspv: 2\n" +
                "mqzr: tzbg - lnbg\n" +
                "tpbz: mpgf * dmss\n" +
                "sbrz: 1\n" +
                "lmcm: 3\n" +
                "pnfg: 2\n" +
                "jgbd: 3\n" +
                "tlmt: 5\n" +
                "fqsb: vwsj + vnqs\n" +
                "qmrz: lfdm + hqpp\n" +
                "hsdq: 14\n" +
                "cbtm: 13\n" +
                "frjq: jvwg * njms\n" +
                "htpb: jttc + dsnj\n" +
                "ptrr: 2\n" +
                "pgrb: 3\n" +
                "hggw: 4\n" +
                "bjvw: fpzr * dhtz\n" +
                "sgcz: 2\n" +
                "rqvt: mrzp + hfds\n" +
                "smjw: 5\n" +
                "rzln: 3\n" +
                "svsg: tppt * rfqp\n" +
                "zdws: bczw + gvfn\n" +
                "nnsh: 12\n" +
                "mtgc: mhjp * qngr\n" +
                "wlzb: htpb * gbwz\n" +
                "flmm: 3\n" +
                "bnfb: 3\n" +
                "frfw: wmsc * hbbs\n" +
                "mzmt: 2\n" +
                "zfdf: 17\n" +
                "mmwg: ptqz * tqls\n" +
                "shhs: vhml + qvnb\n" +
                "vwsj: mqhd * sqlt\n" +
                "cgsd: jmbr + chrl\n" +
                "lrmc: lqsl * sgtr\n" +
                "vdrr: mzsd + pfwf\n" +
                "rgqf: zhgq + bgtf\n" +
                "lzdj: zmdb - jltt\n" +
                "shwn: vzcw - dvvc\n" +
                "vwct: 3\n" +
                "fcgv: fvdn + pjpp\n" +
                "ddhl: jmtn + msvg\n" +
                "sfgg: sggs + plrp\n" +
                "tnnm: 5\n" +
                "plbn: bhpl * mcrn\n" +
                "lmvh: qvjc * hqgd\n" +
                "nsdp: 4\n" +
                "tpzc: 5\n" +
                "ztgf: tmpd * djqd\n" +
                "wsbj: 3\n" +
                "vzhd: 4\n" +
                "wbcn: 19\n" +
                "qtdt: wdhm * jvfq\n" +
                "ttnj: 3\n" +
                "jcvj: 15\n" +
                "dznm: fzfp * mzjn\n" +
                "dghs: 4\n" +
                "jdsg: 2\n" +
                "pzpd: 3\n" +
                "hrsr: 5\n" +
                "wzsp: twmg * tgvj\n" +
                "rnqg: 2\n" +
                "mmzd: 3\n" +
                "lffp: hbqs * pcnh\n" +
                "twbm: mlgw * pbtp\n" +
                "thsv: 3\n" +
                "tjtl: bgzf + slrj\n" +
                "qlzm: vgsc - qwqn\n" +
                "mlbn: 5\n" +
                "ndrv: 5\n" +
                "bglh: vjlg - sgqt\n" +
                "nlmf: blqz * vsnh\n" +
                "fpdm: mhvf * jjgm\n" +
                "rfqq: jmwj * lqmh\n" +
                "dgbh: 7\n" +
                "dtrv: 2\n" +
                "mjpv: hvwc + snvn\n" +
                "ffjf: 3\n" +
                "zlrs: ndzj * vtps\n" +
                "nhqn: rpst + ltss\n" +
                "pdtc: jqgc * rbcd\n" +
                "lpwb: 3\n" +
                "zclb: dvnq + gpgw\n" +
                "vmvr: 13\n" +
                "wvsf: lrjw / zlbg\n" +
                "rfcr: ssnr + rtcl\n" +
                "zvbw: ndbm + tdwh\n" +
                "fpqw: 2\n" +
                "ccsd: 11\n" +
                "fmtl: 3\n" +
                "jhqj: 6\n" +
                "ntqf: 17\n" +
                "lrrn: 12\n" +
                "hvms: 10\n" +
                "lmrv: 2\n" +
                "nmdl: pvqw * wcwq\n" +
                "vwqt: 5\n" +
                "qsqs: jwvb * szqv\n" +
                "nmrw: trrn * gndq\n" +
                "ntdg: szbd * vnbc\n" +
                "fwpv: 2\n" +
                "ghhs: rjcq * mpfg\n" +
                "sfsm: 3\n" +
                "cfgs: pptl - ssrt\n" +
                "tftb: vslv + gcrr\n" +
                "clvb: rngg * vvvt\n" +
                "wvhf: drvr + rfdz\n" +
                "lhwj: 2\n" +
                "zftq: fshz + gqhm\n" +
                "gjmp: 13\n" +
                "wnqt: mgpb / qffg\n" +
                "pvps: 7\n" +
                "fcnz: pngb * vccg\n" +
                "htpn: 5\n" +
                "mjfz: 2\n" +
                "zntr: rpqg * zbhc\n" +
                "zffw: cbnj * mfln\n" +
                "vptc: wcvd + tntn\n" +
                "fgbv: swfv / zqhr\n" +
                "dczs: 3\n" +
                "bzmg: hbql * hgdr\n" +
                "fvdd: 5\n" +
                "qjmj: 1\n" +
                "hjzm: jpfz / pcpb\n" +
                "ptgq: 5\n" +
                "dnnv: 2\n" +
                "qwmg: 2\n" +
                "tsns: qbgg * gsjw\n" +
                "nppv: jwfv * hnsm\n" +
                "pwjl: frjq - ttwg\n" +
                "dcgm: qtzh + wpwc\n" +
                "jgsl: rrrc / fpbw\n" +
                "wjqg: 13\n" +
                "qtwv: tmgj / vqnl\n" +
                "zlwj: lbgf * pdlh\n" +
                "pqds: ztmz * fmsz\n" +
                "ghbb: 2\n" +
                "jlln: qmcp + rldv\n" +
                "lbgb: dztw + flhw\n" +
                "bndj: 3\n" +
                "tsmw: 5\n" +
                "vtvz: jmwd + znhv\n" +
                "gjqh: bdph * zndh\n" +
                "hrwm: gzmg * vcfv\n" +
                "mnfv: 2\n" +
                "dmlf: qglb * bwpf\n" +
                "rwgh: 2\n" +
                "zvff: bnlb + prrs\n" +
                "jmzp: 3\n" +
                "vvgt: hsls - lfcd\n" +
                "gtcv: 18\n" +
                "vsjr: 11\n" +
                "bmpj: 4\n" +
                "rpmg: wjsm + lnhq\n" +
                "cnbd: zwph + vdfq\n" +
                "pcvg: ncnb * mmzd\n" +
                "bzvl: 11\n" +
                "pngb: zzdd / wbbm\n" +
                "bzrr: 3\n" +
                "vdqn: 6\n" +
                "wffs: 2\n" +
                "rbqm: gcvq + vdjt\n" +
                "spmf: vzlw * wmdn\n" +
                "qhfc: 2\n" +
                "dvfv: pmbn * gbhz\n" +
                "zhbr: 6\n" +
                "psvv: 2\n" +
                "zhmm: vpts * wtbc\n" +
                "mlwj: hwsn * bggp\n" +
                "rzbs: drjr * cqwt\n" +
                "mfpf: fhnh - qjhj\n" +
                "dzlh: 1\n" +
                "zlrl: qzdj + psft\n" +
                "qdrn: 4\n" +
                "zwfr: 1\n" +
                "tdqq: nfgf * nflw\n" +
                "bdhc: cvnc * trch\n" +
                "czms: 2\n" +
                "sldj: 14\n" +
                "lqvf: mfhw + jqsj\n" +
                "chsr: jbdj * lpbj\n" +
                "brpv: wzhw / fvqp\n" +
                "bbdf: 17\n" +
                "prcj: jsts + ffvr\n" +
                "wgrj: tqsq + jtsv\n" +
                "zqbw: vcbb * fvvv\n" +
                "bzvg: 6\n" +
                "jgrn: 13\n" +
                "pcqq: 2\n" +
                "zwzq: dwmd + znqv\n" +
                "mgdr: 3\n" +
                "rnmz: ngcf * brld\n" +
                "sglw: pvps * bzvl\n" +
                "hcdn: hdcd * hppc\n" +
                "fbtm: mlvw + cdzv\n" +
                "wnjp: zffw + lrqn\n" +
                "lfmw: 13\n" +
                "lqzj: hdsr * mgvz\n" +
                "wpvn: jmcq * fgmq\n" +
                "zjtq: 9\n" +
                "qzhl: qdrn * jbrb\n" +
                "wldt: dmfz * plhw\n" +
                "dgfs: 3\n" +
                "fccw: 2\n" +
                "gjbw: 4\n" +
                "zglh: 10\n" +
                "lsdw: cldl * wfgw\n" +
                "stzj: 2\n" +
                "pptl: qnpd / tlch\n" +
                "qjhj: qnfr + dntp\n" +
                "glrs: jrth * bdhc\n" +
                "vjnq: pzpd * drql\n" +
                "qrsd: hbzt * hdpd\n" +
                "zlbg: 2\n" +
                "hsqm: jcts - lpwb\n" +
                "msbw: tzdm * dchs\n" +
                "cvrs: 3\n" +
                "wbbj: rmrz / vhjd\n" +
                "dphh: 2\n" +
                "szcp: qdlt * cpvn\n" +
                "qfpw: 7\n" +
                "lmmg: 2\n" +
                "jmcs: 5\n" +
                "cwwv: 8\n" +
                "fpzf: 5\n" +
                "fpfm: jfvg + gblp\n" +
                "jcgt: 2\n" +
                "sbfb: 19\n" +
                "hdhc: 3\n" +
                "wmwq: ppbl + hsrw\n" +
                "gmts: qzzm * fwjf\n" +
                "lqtn: 7\n" +
                "flnz: rccq * gddt\n" +
                "phnn: cvrs + jqlv\n" +
                "rqrq: cbjl * dgbh\n" +
                "qmbs: 9\n" +
                "pwzt: hcpn * gjcg\n" +
                "zzjq: 3\n" +
                "bbrp: qwrv + jzcb\n" +
                "rwjm: 5\n" +
                "qvgn: 3\n" +
                "rjcq: 4\n" +
                "dvpq: lbgb + cbpg\n" +
                "hdwz: scjl * dvnt\n" +
                "vffh: sdcb + qvbr\n" +
                "zjzb: 2\n" +
                "fpjg: zjbg + dctp\n" +
                "pjsb: vfwg + bttj\n" +
                "sqcv: 7\n" +
                "tcvt: ppdv + rwtl\n" +
                "lmrn: hvmh * dznm\n" +
                "gzlc: 9\n" +
                "tgtf: 5\n" +
                "cwcj: dwdt / rwfb\n" +
                "lsdv: djsj * bgfg\n" +
                "mbvd: 3\n" +
                "whfg: 2\n" +
                "czdw: 2\n" +
                "cgzp: 1\n" +
                "rdqq: 3\n" +
                "rnzp: fgtz * mrgj\n" +
                "qmmm: vlbn * rbbn\n" +
                "ldst: 5\n" +
                "vwbn: dvhb * fqsb\n" +
                "cqdh: lhhh + tqqb\n" +
                "ccdl: frmv + fhfr\n" +
                "mfmz: flsp + mppd\n" +
                "wtbc: 5\n" +
                "sqsm: 3\n" +
                "nztt: mwqj + prdr\n" +
                "sdfv: 2\n" +
                "lclr: 3\n" +
                "vqct: 2\n" +
                "qrwn: nzrd + nmqh\n" +
                "hfrr: 8\n" +
                "zbmw: jbqd * fpjg\n" +
                "lnvs: mfjn * tbsd\n" +
                "jdcb: vgbr + zhbr\n" +
                "lmzg: 20\n" +
                "mcrn: 2\n" +
                "vqmg: 2\n" +
                "tlch: 2\n" +
                "rbdz: lmcm + vlzp\n" +
                "nnbg: 8\n" +
                "cqqc: gdgw * lbjj\n" +
                "szbd: 3\n" +
                "qtcs: lclr * hzhg\n" +
                "mssm: qlrm / qccj\n" +
                "smcv: 17\n" +
                "rrnl: humn - rdfh\n" +
                "vlbn: wmjd * wzcr\n" +
                "nwwh: 17\n" +
                "ztbz: mrpw + ptsz\n" +
                "dgjj: 3\n" +
                "cgbt: rcjt * zrlr\n" +
                "qshv: jdcb * rjbd\n" +
                "rphw: 3\n" +
                "lnsn: 4\n" +
                "nvvl: 3\n" +
                "jtbl: 2\n" +
                "lhph: 2\n" +
                "rcvn: 3\n" +
                "hwjh: hcnd + hcdn\n" +
                "pmjj: gnpg * zpvw\n" +
                "pbcp: bcfv + cfrr\n" +
                "wvsq: zhds + mjhc\n" +
                "qvbr: 2\n" +
                "tswr: fpdm + prjl\n" +
                "mvpd: qhvp + blqj\n" +
                "hzhg: 2\n" +
                "hqgd: 2\n" +
                "vslg: llbb * hlvz\n" +
                "pltv: 2\n" +
                "gwnc: qblv * qhfj\n" +
                "btht: 3\n" +
                "zgww: 4\n" +
                "pglg: ghjs * cbsj\n" +
                "zgnq: cppw - tbmp\n" +
                "jwvb: 3\n" +
                "ptqz: 2\n" +
                "lthd: 13\n" +
                "vzlw: 7\n" +
                "qvph: cglm * vghb\n" +
                "gzjf: 9\n" +
                "mphq: 2\n" +
                "jcpt: 2\n" +
                "rmlc: 2\n" +
                "nwvg: 2\n" +
                "rqlf: cbjv * wnjb\n" +
                "mdbh: ctwj + twzt\n" +
                "mprv: tvtm - pzgz\n" +
                "mfjn: 2\n" +
                "gnwf: 4\n" +
                "ngcf: pszm * lvcp\n" +
                "hmhc: 2\n" +
                "vlzz: 2\n" +
                "qfqn: 12\n" +
                "zvdt: 4\n" +
                "zqgz: szcw + pmrn\n" +
                "jlsf: jfbv * nqrr\n" +
                "jcts: pdzw * hmfc\n" +
                "jmwn: wwns * tzwv\n" +
                "hbqq: 2\n" +
                "vgdb: 2\n" +
                "gvfz: ncbs + cpbr\n" +
                "mfwc: 7\n" +
                "prjl: hzff * qgdh\n" +
                "hpjf: 3\n" +
                "jjfn: sflp * csmg\n" +
                "qpbr: lhwj * vgtt\n" +
                "jdfq: hbfh + qwvh\n" +
                "fsqd: phnn + mgmd\n" +
                "fhcw: bzvg * whws\n" +
                "ddtg: wvsf + gvtz\n" +
                "mgpb: qcpw * cnml\n" +
                "nzrd: 2\n" +
                "mpgs: zcbr + rfcm\n" +
                "hwmr: fqrr - fmhd\n" +
                "rccq: 11\n" +
                "hvth: 4\n" +
                "zbnn: tnnm + tvnr\n" +
                "rfdz: rslm * plrj\n" +
                "zmtb: hzrq + rqrq\n" +
                "lvwq: lgcb * wnrj\n" +
                "wzfm: 9\n" +
                "vwlc: rnvl * vbmh\n" +
                "vlzj: grvc * qbcm\n" +
                "dtnn: 3\n" +
                "qdwb: 4\n" +
                "ncwv: 3\n" +
                "sgtr: 20\n" +
                "cbhf: 6\n" +
                "dpbw: 4\n" +
                "qvnb: 2\n" +
                "ghdl: 4\n" +
                "qsbv: 2\n" +
                "vvhn: jbzb + ggjg\n" +
                "tmgj: 12\n" +
                "lgnf: btdn + fpcc\n" +
                "msvg: vlml * pwhq\n" +
                "tggd: fwtt * bhwm\n" +
                "szfc: fdbh + stht\n" +
                "ncbs: jwvm + jffh\n" +
                "jpjq: jpdc / htpg\n" +
                "nwbd: slsl * zhqj\n" +
                "pmgl: 3\n" +
                "nwvb: cwbr * jcqq\n" +
                "blmb: wcfl * vfds\n" +
                "wzhg: blfw * qsbv\n" +
                "jtfv: fmsp + bdhh\n" +
                "tgph: fzbg + jhhd\n" +
                "wpmw: jjzr * bqsq\n" +
                "mjjf: 10\n" +
                "zqvz: djrn - hcbl\n" +
                "vbct: mspg + lwgm\n" +
                "qvct: sfgg + ltzz\n" +
                "pqnp: tvdl * rjwz\n" +
                "vbzr: 3\n" +
                "ztqq: srtb - mfmz\n" +
                "wlpm: trvm + pptt\n" +
                "fdwm: fgvn * qbjm\n" +
                "vzns: 3\n" +
                "bcwv: 1\n" +
                "jctj: fbsc * pfwz\n" +
                "zrcm: qbsf * wsvj\n" +
                "hdvn: zdtq * jztj\n" +
                "qgnm: 2\n" +
                "nwhz: sglw + zsmc\n" +
                "fsbg: djsp + dgsb\n" +
                "jmwj: 2\n" +
                "lrsd: 5\n" +
                "tjzm: 2\n" +
                "jbnp: dwnh / cwgq\n" +
                "mqts: 11\n" +
                "gstv: tghh * ldst\n" +
                "fhbq: chlf + pntb\n" +
                "pgdd: dllv * tsbv\n" +
                "fwqf: qwmw * zcmj\n" +
                "ggjg: 4\n" +
                "mvvg: wfqb / hgld\n" +
                "chhl: 7\n" +
                "wfqb: fvnb * jzwc\n" +
                "pscl: 2\n" +
                "dztc: 5\n" +
                "bdhh: 8\n" +
                "wlqr: vnbf + fhqz\n" +
                "pnpq: 2\n" +
                "ssmf: 1\n" +
                "qgfh: plbn + ntcp\n" +
                "zcmj: wstv + lhcl\n" +
                "tdwh: 2\n" +
                "clwv: znft + gbfl\n" +
                "qphb: zjvw + jvrm\n" +
                "nrjh: 3\n" +
                "dvfj: cpcn - lpgr\n" +
                "vtsm: qsjt + vwsw\n" +
                "gzwt: 2\n" +
                "zlwq: 2\n" +
                "vmpw: 2\n" +
                "cttp: 10\n" +
                "rcdw: fbrt / fcdn\n" +
                "rllh: 3\n" +
                "mjhc: 1\n" +
                "tsdj: 4\n" +
                "pmrn: 17\n" +
                "pzjm: vncn - jgsl\n" +
                "bqfh: fcnz / mmlv\n" +
                "mbld: 1\n" +
                "jtlv: 3\n" +
                "pwsb: 5\n" +
                "qjzr: sqjd * zvff\n" +
                "swfw: 2\n" +
                "vrlp: jddt + wtfd\n" +
                "gzbf: bmvs * phlz\n" +
                "fvzh: ccgt * zvhd\n" +
                "mspg: 5\n" +
                "qltq: ggzs * rbwd\n" +
                "fbws: 2\n" +
                "pshj: cfgs * mbsl\n" +
                "rtmz: lrsd * tsvq\n" +
                "lbgj: 5\n" +
                "bgbt: npfh + bqqc\n" +
                "nlpw: vwbf * wvml\n" +
                "gbsh: 8\n" +
                "llpq: snws * prrq\n" +
                "slsf: hcpp + gcpj\n" +
                "wctc: 2\n" +
                "fszm: 4\n" +
                "ngwc: 9\n" +
                "ltws: 8\n" +
                "snws: qmmq * hdbc\n" +
                "mtqw: 1\n" +
                "nbnm: 3\n" +
                "qblf: 3\n" +
                "vvwp: 3\n" +
                "grgb: qjwt - crww\n" +
                "dwrh: 5\n" +
                "gjqm: ctfw * tddl\n" +
                "vcsf: hfrr * fbwt\n" +
                "hpsz: 2\n" +
                "rjjb: jlmg - zwwp\n" +
                "jbcl: 2\n" +
                "vpwc: nrzm * bbnm\n" +
                "fzmt: 15\n" +
                "qbjm: fhsv - mbjm\n" +
                "njrb: zblc * vgwt\n" +
                "jwfv: 2\n" +
                "fpcc: 3\n" +
                "zjss: dfct * spsd\n" +
                "vvgc: szdn + lpqd\n" +
                "cftp: 19\n" +
                "qrgg: schf - fqhj\n" +
                "cqjl: 3\n" +
                "sprz: lqcb * pltv\n" +
                "nhnz: ngwc + hcwt\n" +
                "crmb: 7\n" +
                "dzlc: cftp * psfs\n" +
                "szcw: fqtc * zrnm\n" +
                "vzwd: 2\n" +
                "mpnh: 2\n" +
                "qlsj: 2\n" +
                "vprv: 2\n" +
                "qhjj: dpbw * whql\n" +
                "qdht: dfcq - njzv\n" +
                "lwph: fvnf * hggw\n" +
                "qsht: 7\n" +
                "jrjd: 2\n" +
                "wvml: 2\n" +
                "gbhz: 5\n" +
                "ldng: lvlc * vlhh\n" +
                "nldz: 2\n" +
                "ghdb: 4\n" +
                "vcgj: 2\n" +
                "hsrw: 2\n" +
                "nmwz: dcqr * rljr\n" +
                "vnbf: fvzh - vfsz\n" +
                "zvts: 13\n" +
                "jvqj: 3\n" +
                "fdbh: hzbn + qvph\n" +
                "jzdb: 5\n" +
                "dwdd: 2\n" +
                "jtdp: nqcl * vsdb\n" +
                "hqpp: fzbn * vdgf\n" +
                "dchs: wvls * zwcs\n" +
                "fvqp: 2\n" +
                "gbtt: hqcm - zjgz\n" +
                "hjjq: wfvg + hvms\n" +
                "tgbt: nfvh * nztt\n" +
                "vfwg: bpfr * wmwm\n" +
                "lzvd: 3\n" +
                "cdpz: lqvf + dvpv\n" +
                "jtgj: 6\n" +
                "pjsg: cvsv * mpzr\n" +
                "jvwg: 3\n" +
                "jhsh: qghf * frgb\n" +
                "ttdg: 11\n" +
                "twlg: ntbf * fgjh\n" +
                "qbgw: 2\n" +
                "zspf: 1\n" +
                "bgfg: mssm + zdws\n" +
                "cwbr: shfs * vlhc\n" +
                "httv: tlds + vrft\n" +
                "gzfc: jdfq - fjfd\n" +
                "zbhj: zlcp + rjzw\n" +
                "ssfv: dnrt * jgcj\n" +
                "fmrp: qsqs - ssmf\n" +
                "cfjw: bmft - gjmp\n" +
                "lqcb: wjrh / nrcl\n" +
                "zblc: 2\n" +
                "humn: 4977\n" +
                "cmnn: 3\n" +
                "pbgb: 2\n" +
                "lnqw: cmvf + jmzp\n" +
                "dcnv: hvnt / bftw\n" +
                "sqwh: rmff * mpqh\n" +
                "gjbn: 4\n" +
                "wdhm: hfwm * bmrb\n" +
                "hqlv: 3\n" +
                "cppd: 2\n" +
                "cfqg: 14\n" +
                "fqmq: ttfs * vpql\n" +
                "mnbr: 3\n" +
                "zrbt: rqgq * gtcc\n" +
                "pmnj: 3\n" +
                "tcqm: 2\n" +
                "vjzj: 3\n" +
                "rzqd: ptsn + swws\n" +
                "lgnp: dvfv * rwjm\n" +
                "qhdm: 10\n" +
                "gpbn: 3\n" +
                "dpzp: 1\n" +
                "vdqw: 2\n" +
                "qnsh: btdr + glmv\n" +
                "mqrb: qlmc * cwsv\n" +
                "vqtl: dmhw + qphb\n" +
                "nzcz: 3\n" +
                "hvnt: gwcp * hnlm\n" +
                "jnzl: dghs + pbmp\n" +
                "rzsv: tgmm * mjnw\n" +
                "tgcl: mznj * ftjb\n" +
                "jqpr: vtpc * rzqd\n" +
                "slzj: 2\n" +
                "vncp: wfzr + zswd\n" +
                "pqqw: ptgq * hvjh\n" +
                "hlqs: pgdd / lgnf\n" +
                "mcpp: 3\n" +
                "jcbm: lgnr + cspm\n" +
                "pdbg: 2\n" +
                "zpdb: 5\n" +
                "zzcw: sqds + jtdp\n" +
                "qhfj: qptl * mqts\n" +
                "qnhs: crdp * qtcf\n" +
                "gbwq: 5\n" +
                "bpmb: mbrb + zqwv\n" +
                "ghdc: chbs * rfpm\n" +
                "zsqs: jdft * jtfv\n" +
                "nsnz: 16\n" +
                "rgmr: 3\n" +
                "ctgr: 13\n" +
                "bszs: 2\n" +
                "ddpj: hhzh * mlfw\n" +
                "ljft: 4\n" +
                "sndn: pgbp + qrqg\n" +
                "sjdj: 2\n" +
                "mmtz: 6\n" +
                "lwbm: 2\n" +
                "jjgj: 9\n" +
                "tptt: 4\n" +
                "pfsp: 10\n" +
                "hscl: sfpn * fpqd\n" +
                "twsp: 4\n" +
                "pfwz: qssn * hbnc\n" +
                "wslc: qlrn * lqjq\n" +
                "hhbc: 5\n" +
                "pcnh: 5\n" +
                "lqzq: pqvd * zfdf\n" +
                "jdsp: 5\n" +
                "ndbm: 5\n" +
                "jvfq: 3\n" +
                "nmtw: lmpb * vltn\n" +
                "lqwz: tmmb / lmrv\n" +
                "dhpp: gqqz * vpwf\n" +
                "nsbn: tfsr * pwzv\n" +
                "fshz: 3\n" +
                "qcnl: 3\n" +
                "cgcc: zfbd * zsvw\n" +
                "jltt: bgfz * fszm\n" +
                "tntn: 1\n" +
                "pvqc: 8\n" +
                "zccn: 2\n" +
                "qqcm: fsqd + qsmf\n" +
                "qhmm: 11\n" +
                "bzsv: gmpg + chhl\n" +
                "qtdf: 5\n" +
                "pvws: 4\n" +
                "jwbd: 5\n" +
                "zscq: jdll / ncwv\n" +
                "vfds: 2\n" +
                "jgcj: qltq + jbdr\n" +
                "mspn: tnwn * dgfs\n" +
                "fzsr: 6\n" +
                "qdvq: 3\n" +
                "jlvz: 2\n" +
                "dgvd: 2\n" +
                "cbmf: 2\n" +
                "cbsj: 3\n" +
                "nqsh: 4\n" +
                "wcqb: plmc + rhnj\n" +
                "rbpl: hqvg * stzj\n" +
                "bmft: llzc * frfw\n" +
                "pdzw: 5\n" +
                "frmv: qvvt + dbsp\n" +
                "ztmq: jhsh + pdtc\n" +
                "jsbf: 3\n" +
                "nqnq: nszf + ftth\n" +
                "cvjs: ltsp - vqmg\n" +
                "wgvp: 5\n" +
                "vmzr: jrsq * bscv\n" +
                "mzsd: pbzn + gllb\n" +
                "tsvq: 5\n" +
                "clhh: 5\n" +
                "mtct: 2\n" +
                "wbbz: 3\n" +
                "ssnr: tghq * qlnp\n" +
                "jqjq: hcfp + bfsh\n" +
                "hczr: zlrm / jhbw\n" +
                "dllv: 8\n" +
                "jmhq: cjcr * lqsn\n" +
                "sprp: 3\n" +
                "bgzf: 13\n" +
                "jbdb: fsmq + zddd\n" +
                "stqf: 2\n" +
                "rfcm: tjvp * wvpd\n" +
                "vfsz: vzmv * jgfp\n" +
                "vvlf: 2\n" +
                "rqts: 4\n" +
                "dthb: llpq * wlzb\n" +
                "vpdp: wrzm - cqzt\n" +
                "lnhq: pwzt + rzrj\n" +
                "lpbb: cbrb / bqht\n" +
                "rbjf: 3\n" +
                "mztq: nwvb - vvgc\n" +
                "fbzq: 2\n" +
                "rbts: gpnl * jldt\n" +
                "wfbd: mvwc * gbhl\n" +
                "nchh: bwjp + pvmh\n" +
                "fppb: 2\n" +
                "ssrg: rrnl / blts\n" +
                "zsjn: dtnn * vzvq\n" +
                "fvnf: 14\n" +
                "ftth: zphm * cmqj\n" +
                "vdwn: 3\n" +
                "tmqf: 5\n" +
                "bqfl: 3\n" +
                "dtft: hldc + vvrz\n" +
                "vfzl: lwqb - shlw\n" +
                "hvsr: 3\n" +
                "chlc: gzwt * rdqq\n" +
                "qwmw: 4\n" +
                "ftqb: zgdw * mnfv\n" +
                "ctfw: ggwc + ttwb\n" +
                "cbjl: fcjc / qvch\n" +
                "hwmc: shvd * vdlb\n" +
                "wbfd: cpzl + cqld\n" +
                "crfb: tmcf * dzzq\n" +
                "mwsf: wfqz * rzgw\n" +
                "cqld: 4\n" +
                "ltbd: wnqt / hczv\n" +
                "gjhj: wpvf + spvf\n" +
                "ltrl: 6\n" +
                "pglf: phmr * jvnl\n" +
                "ctbp: pqdc + trml\n" +
                "tsjm: dfwj * vnmt\n" +
                "msrf: hpzw + qhdm\n" +
                "hqrf: 1\n" +
                "rsqc: 3\n" +
                "rvmc: 2\n" +
                "bjdt: cvbw + vqtl\n" +
                "qjdf: qdsj + pqds\n" +
                "hzwz: 6\n" +
                "hlhs: 3\n" +
                "hvfp: 6\n" +
                "qcwt: 4\n" +
                "hhzh: jfvs - qtzr\n" +
                "hldc: qrdg * mzmt\n" +
                "rthm: 4\n" +
                "fvvv: 2\n" +
                "fjhb: bgqr + cqqc\n" +
                "ccgt: dgbj * pmnj\n" +
                "zbww: vvcv * jcbn\n" +
                "sznl: 5\n" +
                "fcgr: rlwh * vqrd\n" +
                "nhhz: nglc + pjjp\n" +
                "tthn: nmth * hpsz\n" +
                "hrbz: 2\n" +
                "zhqj: wpcc - nqvn\n" +
                "zgmv: 11\n" +
                "jtwc: vhmg / jlvz\n" +
                "swlj: 17\n" +
                "blcn: 6\n" +
                "pjjp: tlfw * fzsr\n" +
                "fzbg: 1\n" +
                "qcwm: vwnm * rgmr\n" +
                "sggs: hwwr + msrf\n" +
                "fhqp: 5\n" +
                "srqs: gmvs + gfvh\n" +
                "sphz: 2\n" +
                "vfsb: whqf * nphn\n" +
                "bmvs: 4\n" +
                "rtcl: jfls * fpvq\n" +
                "ndqt: hjwb * plbc\n" +
                "hcfp: 6\n" +
                "rzgr: 8\n" +
                "drgg: 3\n" +
                "dsnr: 4\n" +
                "hwbt: 2\n" +
                "ppbl: 5\n" +
                "vwcq: 3\n" +
                "gjft: 5\n" +
                "vpql: 2\n" +
                "dffp: 13\n" +
                "cfrr: jsgs + hqvd\n" +
                "gdvv: ddnd + zvdw\n" +
                "wztg: sjlg + rdpw\n" +
                "smnh: 3\n" +
                "dlzb: 2\n" +
                "bqqc: 7\n" +
                "fzbl: 2\n" +
                "gsjt: dtsb * mbzb\n" +
                "fsmq: tlmm + vggh\n" +
                "dbgm: 5\n" +
                "wcwq: 5\n" +
                "bztw: hmwl + hwbt\n" +
                "wspz: htsc + lnvs\n" +
                "hcbl: 2\n" +
                "plhw: 3\n" +
                "nqdh: slsf * fhrh\n" +
                "rpvj: hhbc * tjzm\n" +
                "jfnp: qlqd + jbqn\n" +
                "bhht: 11\n" +
                "tswm: stcc * szpp\n" +
                "rfrd: tjcv * nsbn\n" +
                "zzhh: 5\n" +
                "hqgj: zsnz / zjsm\n" +
                "wbsb: hzdf * jtlb\n" +
                "tgvj: 3\n" +
                "mwqf: vdlq * csvq\n" +
                "vtpc: 4\n" +
                "pszd: 3\n" +
                "nrzm: 2\n" +
                "gmbp: 12\n" +
                "jrps: 2\n" +
                "lpbl: 13\n" +
                "swcn: wdmc * fvdd\n" +
                "fhsv: qsqv + tlwc\n" +
                "rtpw: 4\n" +
                "pqdc: 2\n" +
                "qdlv: lqpq * rnqg\n" +
                "qwpj: 1\n" +
                "sgrc: vdvh * qnhs\n" +
                "gmwr: gwnc + ssrg\n" +
                "grbp: 20\n" +
                "fvfd: 4\n" +
                "rhwj: wffs * hvgr\n" +
                "hnrv: 16\n" +
                "gnnd: 3\n" +
                "pcpb: 2\n" +
                "mhdf: 2\n" +
                "bcbp: ssrb * zsbv\n" +
                "ztzs: vdrr * qvrb\n" +
                "mnfm: 2\n" +
                "wlgz: 5\n" +
                "drqs: rwgv + dnmb\n" +
                "jbdr: swqv * gmqb\n" +
                "rqll: 3\n" +
                "nfgf: 4\n" +
                "qvjt: 5\n" +
                "cspm: tgbt - npqg\n" +
                "nsqz: 17\n" +
                "ldzg: dgjj + hnnl\n" +
                "pvts: 5\n" +
                "lcfw: rqcv * qsdh\n" +
                "fhrf: shln * ssnw\n" +
                "zsbv: 4\n" +
                "bhpl: 4\n" +
                "wrnz: wjnb * bndj\n" +
                "pddq: dtzp + gncs\n" +
                "qqjv: 2\n" +
                "fmct: 2\n" +
                "zlcp: blhj + bbmw\n" +
                "cstn: lclq * mhdf\n" +
                "vtpv: wdvr * wtdz\n" +
                "cpbr: nlmf + zqcm\n" +
                "dmzq: 1\n" +
                "pltj: 4\n" +
                "jmsv: wpjj + mlmd\n" +
                "ngpj: 15\n" +
                "qdvz: ncld * mcpz\n" +
                "vthr: 2\n" +
                "szhv: 13\n" +
                "gnrs: pfsp + wctq\n" +
                "mcpz: 2\n" +
                "ndtj: 2\n" +
                "hlsb: prcj + nncc\n" +
                "bcbz: qsht - qjmj\n" +
                "dtjw: nqnq + jjfb\n" +
                "grjm: jrrn * fmtc\n" +
                "dblp: pwjl + zwsw\n" +
                "htph: 4\n" +
                "trml: 6\n" +
                "psbv: rnwd + hjhf\n" +
                "qqtl: ppbc * mrcb\n" +
                "cvsv: 6\n" +
                "hjtb: 4\n" +
                "jbzb: 3\n" +
                "vgtt: 3\n" +
                "jtlb: lzvs + qwpj\n" +
                "zswd: wgmp / hsjt\n" +
                "vcvw: crjq * wnrl\n" +
                "rvmd: 4\n" +
                "dzdn: dwzm + thjg\n" +
                "qlrm: hdwz * qrrm\n" +
                "jcnh: 2\n" +
                "mngs: ddhl * ccjd\n" +
                "fhdw: 5\n" +
                "zmrl: 2\n" +
                "vdgn: 2\n" +
                "wcjq: bjvw - hcvt\n" +
                "zssh: 14\n" +
                "vgzm: smnh * fvtf\n" +
                "cdfc: 4\n" +
                "fvns: 3\n" +
                "qrdg: zzhh + zcwd\n" +
                "lzvs: 9\n" +
                "bmhl: 3\n" +
                "dvbm: cwtj + ldll\n" +
                "rgmn: 2\n" +
                "rslm: 3\n" +
                "cjzc: 2\n" +
                "jlpg: 6\n" +
                "lgwf: pblq * shwn\n" +
                "lzcv: zlvf * vhcs\n" +
                "dqbs: pdcb * hgcv\n" +
                "zmql: 1\n" +
                "ngvn: hnmf * mtpn\n" +
                "qvzs: 4\n" +
                "qvjc: 7\n" +
                "rnwd: lhph * wzhg\n" +
                "nwvs: vzbv * hncs\n" +
                "jbrb: bqfh + tsns\n" +
                "zrsd: lzcv + fngt\n" +
                "mlbb: 2\n" +
                "svzb: 12\n" +
                "qrvc: 2\n" +
                "bjdc: 6\n" +
                "htvm: 11\n" +
                "wmjd: 2\n" +
                "lvnt: 7\n" +
                "zhhd: vdqn + fqvr\n" +
                "jvgw: wmfc * wslc\n" +
                "dgbj: dvfj + bdmh\n" +
                "vmzg: ctdj * dbgl\n" +
                "qwqn: rlln * sgcz\n" +
                "wpcc: tzcb / sfrp\n" +
                "mtgt: 2\n" +
                "ntdp: 3\n" +
                "qglb: zzrm * qfss\n" +
                "sltm: 2\n" +
                "bzpc: drqs + gdhz\n" +
                "mhng: mqpp + bzbp\n" +
                "ljfc: 2\n" +
                "zrlw: pghh * qrgg\n" +
                "tjdq: zdvg * cstn\n" +
                "bdmh: cmzl + rrsb\n" +
                "gmqb: wsgc + nsrr\n" +
                "dcrr: smlz * jglm\n" +
                "jbdj: cfqg / qdlh\n" +
                "vgbr: 1\n" +
                "hmgl: gjqh + qqjv\n" +
                "gbhl: 2\n" +
                "wcfl: dnjt * cbmf\n" +
                "jbqd: 2\n" +
                "srnb: sprz * mtgf\n" +
                "vqrd: 2\n" +
                "bgfz: pjcc + gdwp\n" +
                "mbrb: 10\n" +
                "bhmp: qtdt + lbhq\n" +
                "nmqh: qlgj + zsvb\n" +
                "pwsp: 2\n" +
                "fqrr: qhzh + bwfq\n" +
                "gvlv: 5\n" +
                "hvwc: clhh * rwdg\n" +
                "qrrm: twlg + qdlv\n" +
                "thjg: tmqc + zcsz\n" +
                "bjnh: mmnl - nhhz\n" +
                "sflp: rjjb + hqnd\n" +
                "vdjt: 17\n" +
                "gmvs: ssfv + zrsd\n" +
                "jzwc: 2\n" +
                "bgdg: ttnj * rmzb\n" +
                "mbwv: pglf + mztm\n" +
                "ssrt: 4\n" +
                "qsjt: qrhr * jlpg\n" +
                "slrj: 16\n" +
                "zwvl: dbgm + bwnr\n" +
                "qrjw: wcqb * vvbv\n" +
                "jlwv: 3\n" +
                "lpqd: 2\n" +
                "mfrf: dpzp + wsjn\n" +
                "pslg: 4\n" +
                "ghzr: tdvz + dqbs\n" +
                "hbql: 5\n" +
                "qwvh: frvq * lpdw\n" +
                "tgmm: 4\n" +
                "tmpd: gqzc + qjzr\n" +
                "gdhz: 5\n" +
                "rnvl: 5\n" +
                "wmpp: 5\n" +
                "ffbf: wnqf / rzvb\n" +
                "mqgl: 8\n" +
                "cbtb: glrs + zftq\n" +
                "pcwt: 2\n" +
                "qrss: 1\n" +
                "htrl: jhrj * gftq\n" +
                "njtf: 13\n" +
                "wfnc: dvdl * bpmb\n" +
                "chfp: mjfz * cwpz\n" +
                "zqzl: ggpb * tqcj\n" +
                "qctc: qhwr + jsdm\n" +
                "wlqv: 2\n" +
                "fdmm: jrps * cqdh\n" +
                "lnls: htvv + jcsw\n" +
                "lvqq: qslv / hctq\n" +
                "whqf: 3\n" +
                "vwzv: wwcm * hdbm\n" +
                "dwtf: fszl - dlft\n" +
                "rhgh: jspz + bhlh\n" +
                "lqlb: 11\n" +
                "tzgm: hnrv / svsn\n" +
                "bnpf: 5\n" +
                "fcfp: dgvd * bnfb\n" +
                "zqwv: 1\n" +
                "nclw: vfzl + zzmc\n" +
                "htsc: 5\n" +
                "vpwf: 5\n" +
                "djjw: 4\n" +
                "bsnd: bldn / zvhf\n" +
                "jbdw: 4\n" +
                "btzv: 2\n" +
                "rdnm: 7\n" +
                "rdvt: 2\n" +
                "vnmt: grrw + qvzs\n" +
                "qtzh: dwdw * nltc\n" +
                "fqvr: 1\n" +
                "jffh: vsfv * cmwp\n" +
                "hpzw: 1\n" +
                "jhrj: 2\n" +
                "lvgv: wnls + clvc\n" +
                "plbc: 3\n" +
                "ggvj: 3\n" +
                "tlgj: dths + nhsv\n" +
                "zjpl: rchl + hdvn\n" +
                "rdpw: 1\n" +
                "lzwr: 13\n" +
                "pvqw: nmwz + ngpj\n" +
                "tshc: 7\n" +
                "qsjp: vcnz * vmpw\n" +
                "fnjv: 9\n" +
                "vfmd: svvn + clwv\n" +
                "tmmb: jssv * wwrl\n" +
                "dhsn: fpbl + dfmw\n" +
                "njms: 3\n" +
                "tnwn: rqts * jcgt\n" +
                "frws: 14\n" +
                "tthw: dpcp * qvjt\n" +
                "lfcr: rpdd + fwqf\n" +
                "qbbc: swzg + mjgw\n" +
                "nbvq: 2\n" +
                "rsvp: 5\n" +
                "cgss: lpbl * zwzq\n" +
                "lnft: 5\n" +
                "trnd: 5\n" +
                "htnl: lgwf / cmnn\n" +
                "tbgg: sldj * ttbl\n" +
                "mqvf: 5\n" +
                "wwns: 3\n" +
                "gqhm: bhpf * wvhn\n" +
                "vbwz: 3\n" +
                "wfvg: 19\n" +
                "djrn: 9\n" +
                "vbbn: 13\n" +
                "mhpr: 3\n" +
                "wwwf: cqbw + tshc\n" +
                "hhjf: lpmc + dczs\n" +
                "tzjq: tdqq + dwcn\n" +
                "sntq: 2\n" +
                "lvzt: rzln * trwg\n" +
                "bnlb: hchs * lshw\n" +
                "bbnm: 3\n" +
                "gpgw: 3\n" +
                "ffdl: sbfh + tbgg\n" +
                "rcrb: 3\n" +
                "lfcd: gwsn * mvdw\n" +
                "thnj: 5\n" +
                "qvrb: 5\n" +
                "pwzv: qhzz + rntv\n" +
                "tzdm: fhdw + fqmq\n" +
                "trrn: 3\n" +
                "jnmz: gjhh - bqcd\n" +
                "sfrp: 3\n" +
                "hjnp: 5\n" +
                "bvmg: snqw / hvfn\n" +
                "snqf: 5\n" +
                "snvn: blth + zhcp\n" +
                "sjlg: dhzd * vwct\n" +
                "szlg: mvbd + grjm\n" +
                "wmsc: hgdt + hlsb\n" +
                "vgsc: vpph + grjv\n" +
                "hdbm: dnzs + mdnp\n" +
                "ntbf: 3\n" +
                "cflr: gqbr * lmmg\n" +
                "wtfd: 11\n" +
                "mjgw: hwmc + lcfw\n" +
                "psdt: 8\n" +
                "lhvw: 7\n" +
                "vnmp: 5\n" +
                "lqmh: 6\n" +
                "csft: zzpn * fdmm\n" +
                "pzlz: szsl * dgtz\n" +
                "rzbt: 4\n" +
                "vcrb: qvgn + wwgb\n" +
                "gbfl: crwj + fgvl\n" +
                "nmww: 3\n" +
                "ghjs: 9\n" +
                "cbwq: ztgd * qwwv\n" +
                "gwsn: 2\n" +
                "dwtp: fbms - lbzm\n" +
                "rbwd: 5\n" +
                "rfqp: 3\n" +
                "fdwl: 2\n" +
                "jvzt: lfmw + fscp\n" +
                "nltc: 2\n" +
                "bnnz: jfpl + tzdc\n" +
                "qbgl: 4\n" +
                "dtgf: vpwc + cgzp\n" +
                "dztw: 1\n" +
                "zgdw: 17\n" +
                "gqzc: gjbw * qqwh\n" +
                "rlls: hhjr * czms\n" +
                "wrzj: gzqg * zmdj\n" +
                "pbvf: qdwb * jvlw\n" +
                "hfds: fthh * fvpb\n" +
                "gndq: 2\n" +
                "whth: 3\n" +
                "lgzw: fhcw + hcsl\n" +
                "tqrc: jtwc * dfmj\n" +
                "fhnh: bnbw + qhvd\n" +
                "vpts: fcjw + mspn\n" +
                "qlrn: 16\n" +
                "bsrr: 10\n" +
                "grvc: 7\n" +
                "slsc: 2\n" +
                "dpzd: prfr * lpqf\n" +
                "ndjc: 5\n" +
                "rbgn: 11\n" +
                "whvd: 5\n" +
                "dbgw: rsvp + pbgb\n" +
                "dpcp: 5\n" +
                "bpnp: 11\n" +
                "fbrt: mbbl + fwzl\n" +
                "zjqm: tswr + jlml\n" +
                "dbnw: dtft * tttr\n" +
                "tzml: 3\n" +
                "gvgr: 2\n" +
                "lbvt: zgbm * dtjw\n" +
                "llzc: 18\n" +
                "gfvz: 2\n" +
                "lrmt: mmwg - qfjq\n" +
                "wjsm: hhlq * psdt\n" +
                "zjbh: pdvb + fpzf\n" +
                "rjdw: 1\n" +
                "jrrz: 3\n" +
                "zddd: 11\n" +
                "fpbl: 3\n" +
                "rwfb: 2\n" +
                "phlz: 5\n" +
                "tzcb: gjhj + ssmj\n" +
                "zjvw: wzmj * shhs\n" +
                "bpng: 7\n" +
                "nhhd: 2\n" +
                "wgqs: lsdv * zpsn\n" +
                "mjpd: 7\n" +
                "mrsv: czsh + crfb\n" +
                "rzvb: 5\n" +
                "dths: 1\n" +
                "hnmf: gtlr + dcqb\n" +
                "zwwp: 2\n" +
                "prrs: 10\n" +
                "lgnr: btpj + rtlf\n" +
                "rfvt: qtvl + cmhv\n" +
                "bldn: rdvt * wfmt\n" +
                "mlvw: qsfs * dfdz\n" +
                "pwhn: frth * zcpp\n" +
                "wqnq: hwwc + rfqq\n" +
                "lpmc: 7\n" +
                "hmwl: 6\n" +
                "dgzr: 3\n" +
                "ntmn: 3\n" +
                "dfct: 3\n" +
                "mhjq: 5\n" +
                "whws: 2\n" +
                "npqg: pqdm * nrww\n" +
                "wsrq: 5\n" +
                "wfqz: wwrp + dgsg\n" +
                "lhfz: 17\n" +
                "qblv: 13\n" +
                "zsmc: gvfz * tqrw\n" +
                "cwsv: 5\n" +
                "fmdg: 2\n" +
                "prbm: wcjq / cdzz\n" +
                "fpqd: 6\n" +
                "psfs: tzjq + lsjt\n" +
                "fghs: 2\n" +
                "bhwm: 4\n" +
                "tdbp: tfll * wbql\n" +
                "tzwv: 13\n" +
                "zmft: 3\n" +
                "zqhr: 4\n" +
                "cfzv: 3\n" +
                "pchs: 3\n" +
                "nwjd: ntdg + hscl\n" +
                "cwtj: 1\n" +
                "jwcp: pfgb + fwtm\n" +
                "ppgt: 16\n" +
                "pslw: rrmb + djjg\n" +
                "slsl: 5\n" +
                "pwll: bgdg * pczd\n" +
                "fpfb: mprv * hndv\n" +
                "jvtm: hlqs + lqlb\n" +
                "vgdp: jztc / bght\n" +
                "mqtr: jgmc * lrrn\n" +
                "tqpq: 4\n" +
                "tqrw: 2\n" +
                "ppdv: nvvl + rjjv\n" +
                "wfzr: rhwj + stfd\n" +
                "jqlv: 4\n" +
                "sclr: 2\n" +
                "zhcc: 4\n" +
                "lnbg: vstd + mmtz\n" +
                "mrpw: qwct * crnv\n" +
                "cnjf: 4\n" +
                "ddrr: 7\n" +
                "rwdg: fdwm + dzlc\n" +
                "psft: 6\n" +
                "bnlv: mnbr * zclb\n" +
                "ltsp: 8\n" +
                "wmst: vznj * nlgt\n" +
                "vczs: 5\n" +
                "flqt: zqcs + nsdv\n" +
                "grhh: pbvt + jzdl\n" +
                "hrjq: 10\n" +
                "rhfw: 2\n" +
                "dtdz: 17\n" +
                "lbjj: 4\n" +
                "gwhg: pqqw + nqdz\n" +
                "pwbj: 3\n" +
                "fwjf: lfcr + wjmj\n" +
                "jdtm: 5\n" +
                "thnw: 3\n" +
                "smjv: 9\n" +
                "rjtz: hdwq / jdwp\n" +
                "pdlh: 2\n" +
                "tczb: plpn * stvr\n" +
                "mjvl: 6\n" +
                "hwwr: 7\n" +
                "spvf: lwtj + vtsm\n" +
                "cnml: 4\n" +
                "cpvj: 3\n" +
                "qfqf: smjv - mqqn\n" +
                "lshw: 3\n" +
                "jjdh: 2\n" +
                "mvbt: 6\n" +
                "zccv: 5\n" +
                "fbdf: 10\n" +
                "bwjp: vjzb * ctgr\n" +
                "mjjc: 2\n" +
                "wffr: grgb * tsdj\n" +
                "mqgr: 19\n" +
                "hcnd: bdbr * qbcq\n" +
                "npnh: 4\n" +
                "hqnd: dnzc * gnnd\n" +
                "plrb: 3\n" +
                "rtzn: vwdh * wbcn\n" +
                "cdzv: qrvc * bnnz\n" +
                "rljr: gwhg - tvpw\n" +
                "scpv: 2\n" +
                "hvfn: 3\n" +
                "hcjr: psms * vffh\n" +
                "bchm: nzgj + dmgd\n" +
                "vnln: 7\n" +
                "pwrn: 3\n" +
                "zqcp: 2\n" +
                "svbl: nmmp + rzgr\n" +
                "sddm: zgww * vdgn\n" +
                "pfsd: 3\n" +
                "wjmj: wlfn + wjph\n" +
                "fngt: nlhj * dpzd\n" +
                "hhsg: 2\n" +
                "wjph: 6\n" +
                "dmnn: plrb * wlqv\n" +
                "qghf: tmlf * wjqg\n" +
                "vmsm: 5\n" +
                "tnnc: nppv + rqfq\n" +
                "frvw: 19\n" +
                "zsvb: 3\n" +
                "qhdc: 4\n" +
                "vslv: mngs + sdfh\n" +
                "hzbn: ghhs * zqbf\n" +
                "cmqj: tthn + rbgn\n" +
                "dpwb: 5\n" +
                "tqqb: sbfb * dztc\n" +
                "jgsd: bbbn - chlc\n" +
                "dnss: bvsm * psbv\n" +
                "dlrb: 4\n" +
                "qhcb: 18\n" +
                "cdff: fgjs + fpqw\n" +
                "gdtc: nzjd * cwvz\n" +
                "lwlw: 4\n" +
                "pqvd: 2\n" +
                "drvr: htvm * ffhf\n" +
                "tbsd: lfcv - tggc\n" +
                "ngws: swjr * bhvz\n" +
                "snqw: bftg * vjzj\n" +
                "ttfs: fdwl * jvvm"));
    }

}