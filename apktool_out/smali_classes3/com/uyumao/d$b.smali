.class public Lcom/uyumao/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/uyumao/d;->a(Ljava/lang/Object;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/uyumao/d;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Lcom/uyumao/d$b;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    sget-object v0, Lcom/uyumao/d;->g:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/uyumao/d$b;->a:Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, "https://yumao.puata.info/cc_info"

    .line 6
    .line 7
    invoke-static {v0, v2, v1}, Lcom/uyumao/k;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
