.class public Lcom/umeng/umzid/ZIDManager$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/umeng/umzid/ZIDManager;->init(Landroid/content/Context;Ljava/lang/String;Lcom/umeng/umzid/IZIDCompletionCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Lcom/umeng/umzid/ZIDManager;


# direct methods
.method public constructor <init>(Lcom/umeng/umzid/ZIDManager;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/umeng/umzid/ZIDManager$b;->b:Lcom/umeng/umzid/ZIDManager;

    iput-object p2, p0, Lcom/umeng/umzid/ZIDManager$b;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/umeng/umzid/ZIDManager$b;->b:Lcom/umeng/umzid/ZIDManager;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/umeng/umzid/ZIDManager$b;->a:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/umeng/umzid/ZIDManager;->b(Landroid/content/Context;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
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
