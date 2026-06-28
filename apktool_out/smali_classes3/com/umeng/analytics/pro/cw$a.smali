.class public Lcom/umeng/analytics/pro/cw$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/umeng/analytics/pro/cs;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/analytics/pro/cw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/umeng/analytics/pro/de;)Lcom/umeng/analytics/pro/cq;
    .locals 1

    new-instance v0, Lcom/umeng/analytics/pro/cw;

    invoke-direct {v0, p1}, Lcom/umeng/analytics/pro/cw;-><init>(Lcom/umeng/analytics/pro/de;)V

    return-object v0
.end method
