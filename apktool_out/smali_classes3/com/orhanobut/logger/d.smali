.class public Lcom/orhanobut/logger/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/orhanobut/logger/g;


# instance fields
.field private final a:Lcom/orhanobut/logger/f;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Lcom/orhanobut/logger/c;->c()Lcom/orhanobut/logger/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/orhanobut/logger/c$b;->a()Lcom/orhanobut/logger/c;

    move-result-object v0

    iput-object v0, p0, Lcom/orhanobut/logger/d;->a:Lcom/orhanobut/logger/f;

    return-void
.end method

.method public constructor <init>(Lcom/orhanobut/logger/f;)V
    .locals 0
    .param p1    # Lcom/orhanobut/logger/f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    invoke-static {p1}, Lcom/orhanobut/logger/o;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/orhanobut/logger/f;

    iput-object p1, p0, Lcom/orhanobut/logger/d;->a:Lcom/orhanobut/logger/f;

    return-void
.end method


# virtual methods
.method public a(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/orhanobut/logger/d;->a:Lcom/orhanobut/logger/f;

    invoke-interface {v0, p1, p2, p3}, Lcom/orhanobut/logger/f;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public b(ILjava/lang/String;)Z
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    const/4 p1, 0x1

    return p1
.end method
