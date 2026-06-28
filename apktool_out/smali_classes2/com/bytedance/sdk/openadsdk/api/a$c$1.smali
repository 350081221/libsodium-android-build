.class Lcom/bytedance/sdk/openadsdk/api/a$c$1;
.super Lcom/bytedance/sdk/openadsdk/api/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/api/a$c;->createAdNative(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/TTAdNative;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bytedance/sdk/openadsdk/api/a$a<",
        "Lcom/bykv/vk/openvk/api/proto/Loader;",
        ">;"
    }
.end annotation


# instance fields
.field a:Lcom/bykv/vk/openvk/api/proto/Loader;

.field final b:Lcom/bytedance/sdk/openadsdk/api/a$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bytedance/sdk/openadsdk/api/a$b<",
            "Lcom/bykv/vk/openvk/api/proto/Manager;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic c:Ljava/lang/ref/SoftReference;

.field final synthetic d:Lcom/bytedance/sdk/openadsdk/api/a$c;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/api/a$c;Ljava/lang/ref/SoftReference;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/a$c$1;->d:Lcom/bytedance/sdk/openadsdk/api/a$c;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/api/a$c$1;->c:Ljava/lang/ref/SoftReference;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/a$a;-><init>(Lcom/bytedance/sdk/openadsdk/api/a$1;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lcom/bytedance/sdk/openadsdk/api/a$c$1$1;

    .line 10
    .line 11
    invoke-direct {p1, p0}, Lcom/bytedance/sdk/openadsdk/api/a$c$1$1;-><init>(Lcom/bytedance/sdk/openadsdk/api/a$c$1;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/a$c$1;->b:Lcom/bytedance/sdk/openadsdk/api/a$b;

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method


# virtual methods
.method public a(Lcom/bytedance/sdk/openadsdk/api/a$b;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bytedance/sdk/openadsdk/api/a$b<",
            "Lcom/bykv/vk/openvk/api/proto/Loader;",
            ">;I)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/a$c$1;->a:Lcom/bykv/vk/openvk/api/proto/Loader;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {p1, v0}, Lcom/bytedance/sdk/openadsdk/api/a$b;->a(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/a$c$1;->d:Lcom/bytedance/sdk/openadsdk/api/a$c;

    .line 10
    .line 11
    new-instance v1, Lcom/bytedance/sdk/openadsdk/api/a$c$1$2;

    .line 12
    .line 13
    invoke-direct {v1, p0, p1}, Lcom/bytedance/sdk/openadsdk/api/a$c$1$2;-><init>(Lcom/bytedance/sdk/openadsdk/api/a$c$1;Lcom/bytedance/sdk/openadsdk/api/a$b;)V

    .line 14
    .line 15
    .line 16
    add-int/lit16 p2, p2, 0x2710

    .line 17
    .line 18
    invoke-static {v0, v1, p2}, Lcom/bytedance/sdk/openadsdk/api/a$c;->a(Lcom/bytedance/sdk/openadsdk/api/a$c;Lcom/bytedance/sdk/openadsdk/api/a$b;I)V

    .line 19
    .line 20
    .line 21
    :goto_0
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method
