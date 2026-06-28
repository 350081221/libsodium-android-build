.class public Lcom/umeng/commonsdk/statistics/common/ReportPolicy$ReportQuasiRealtime;
.super Lcom/umeng/commonsdk/statistics/common/ReportPolicy$ReportStrategy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/commonsdk/statistics/common/ReportPolicy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ReportQuasiRealtime"
.end annotation


# static fields
.field private static DEFAULT_REPORT_INTERVAL:J = 0x3a98L

.field private static MAX_REPORT_INTERVAL:J = 0x15f90L

.field private static MIN_REPORT_INTERVAL:J = 0xbb8L


# instance fields
.field private mReportInterval:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/common/ReportPolicy$ReportStrategy;-><init>()V

    return-void
.end method


# virtual methods
.method public getReportInterval()J
    .locals 2

    iget-wide v0, p0, Lcom/umeng/commonsdk/statistics/common/ReportPolicy$ReportQuasiRealtime;->mReportInterval:J

    return-wide v0
.end method

.method public setReportInterval(J)V
    .locals 2

    .line 1
    sget-wide v0, Lcom/umeng/commonsdk/statistics/common/ReportPolicy$ReportQuasiRealtime;->MIN_REPORT_INTERVAL:J

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    sget-wide v0, Lcom/umeng/commonsdk/statistics/common/ReportPolicy$ReportQuasiRealtime;->MAX_REPORT_INTERVAL:J

    .line 8
    .line 9
    cmp-long v0, p1, v0

    .line 10
    .line 11
    if-gtz v0, :cond_0

    .line 12
    .line 13
    iput-wide p1, p0, Lcom/umeng/commonsdk/statistics/common/ReportPolicy$ReportQuasiRealtime;->mReportInterval:J

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-wide p1, Lcom/umeng/commonsdk/statistics/common/ReportPolicy$ReportQuasiRealtime;->DEFAULT_REPORT_INTERVAL:J

    .line 17
    .line 18
    iput-wide p1, p0, Lcom/umeng/commonsdk/statistics/common/ReportPolicy$ReportQuasiRealtime;->mReportInterval:J

    .line 19
    .line 20
    :goto_0
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public shouldSendMessage(Z)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
