.class Lcom/bytedance/sdk/openadsdk/api/a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bykv/vk/openvk/api/proto/EventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/api/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/sdk/openadsdk/api/a;


# direct methods
.method private constructor <init>(Lcom/bytedance/sdk/openadsdk/api/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/a$d;->a:Lcom/bytedance/sdk/openadsdk/api/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/bytedance/sdk/openadsdk/api/a;Lcom/bytedance/sdk/openadsdk/api/a$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/a$d;-><init>(Lcom/bytedance/sdk/openadsdk/api/a;)V

    return-void
.end method


# virtual methods
.method public onEvent(ILcom/bykv/vk/openvk/api/proto/Result;)Lcom/bykv/vk/openvk/api/proto/ValueSet;
    .locals 0

    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/a$d;->a:Lcom/bytedance/sdk/openadsdk/api/a;

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/api/a;->b(Lcom/bykv/vk/openvk/api/proto/Result;)V

    const/4 p1, 0x0

    return-object p1
.end method
