.class public Lb0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb0/a;


# static fields
.field public static a:Lb0/a;

.field public static b:Lv/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)Lb0/a;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object v0, Lb0/b;->a:Lb0/a;

    if-nez v0, :cond_1

    invoke-static {p0, p1}, Lv/d;->b(Landroid/content/Context;Ljava/lang/String;)Lv/a;

    move-result-object p0

    sput-object p0, Lb0/b;->b:Lv/a;

    new-instance p0, Lb0/b;

    invoke-direct {p0}, Lb0/b;-><init>()V

    sput-object p0, Lb0/b;->a:Lb0/a;

    :cond_1
    sget-object p0, Lb0/b;->a:Lb0/a;

    return-object p0
.end method


# virtual methods
.method public a(Lz/d;)Lz/c;
    .locals 1

    invoke-static {p1}, Lz/b;->a(Lz/d;)Lcom/alipay/tscenter/biz/rpc/report/general/model/DataReportRequest;

    move-result-object p1

    sget-object v0, Lb0/b;->b:Lv/a;

    invoke-interface {v0, p1}, Lv/a;->a(Lcom/alipay/tscenter/biz/rpc/report/general/model/DataReportRequest;)Lcom/alipay/tscenter/biz/rpc/report/general/model/DataReportResult;

    move-result-object p1

    invoke-static {p1}, Lz/b;->b(Lcom/alipay/tscenter/biz/rpc/report/general/model/DataReportResult;)Lz/c;

    move-result-object p1

    return-object p1
.end method

.method public logCollect(Ljava/lang/String;)Z
    .locals 1

    sget-object v0, Lb0/b;->b:Lv/a;

    invoke-interface {v0, p1}, Lv/a;->logCollect(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
