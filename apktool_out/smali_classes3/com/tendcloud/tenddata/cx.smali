.class public Lcom/tendcloud/tenddata/cx;
.super Lcom/tendcloud/tenddata/cy;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/tendcloud/tenddata/cy;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v0}, Lcom/tendcloud/tenddata/x;->c(Landroid/content/Context;)Lorg/json/JSONArray;

    move-result-object v0

    return-object v0
.end method
