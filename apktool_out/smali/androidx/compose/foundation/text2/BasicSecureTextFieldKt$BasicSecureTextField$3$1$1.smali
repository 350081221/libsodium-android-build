.class final synthetic Landroidx/compose/foundation/text2/BasicSecureTextFieldKt$BasicSecureTextField$3$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/text2/input/ImeActionHandler;
.implements Lkotlin/jvm/internal/d0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text2/BasicSecureTextFieldKt$BasicSecureTextField$3;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation

.annotation runtime Lkotlin/i0;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $tmp0:Landroidx/compose/foundation/text2/input/ImeActionHandler;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/text2/input/ImeActionHandler;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/text2/BasicSecureTextFieldKt$BasicSecureTextField$3$1$1;->$tmp0:Landroidx/compose/foundation/text2/input/ImeActionHandler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param

    instance-of v0, p1, Landroidx/compose/foundation/text2/input/ImeActionHandler;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    instance-of v0, p1, Lkotlin/jvm/internal/d0;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/foundation/text2/BasicSecureTextFieldKt$BasicSecureTextField$3$1$1;->getFunctionDelegate()Lkotlin/v;

    move-result-object v0

    check-cast p1, Lkotlin/jvm/internal/d0;

    invoke-interface {p1}, Lkotlin/jvm/internal/d0;->getFunctionDelegate()Lkotlin/v;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    :cond_0
    return v1
.end method

.method public final getFunctionDelegate()Lkotlin/v;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/v<",
            "*>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance v7, Lkotlin/jvm/internal/h0;

    const/4 v1, 0x1

    iget-object v2, p0, Landroidx/compose/foundation/text2/BasicSecureTextFieldKt$BasicSecureTextField$3$1$1;->$tmp0:Landroidx/compose/foundation/text2/input/ImeActionHandler;

    const-class v3, Landroidx/compose/foundation/text2/input/ImeActionHandler;

    const-string v4, "onImeAction"

    const-string v5, "onImeAction-KlQnJC8(I)Z"

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/h0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-object v7
.end method

.method public final hashCode()I
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/text2/BasicSecureTextFieldKt$BasicSecureTextField$3$1$1;->getFunctionDelegate()Lkotlin/v;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final onImeAction-KlQnJC8(I)Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text2/BasicSecureTextFieldKt$BasicSecureTextField$3$1$1;->$tmp0:Landroidx/compose/foundation/text2/input/ImeActionHandler;

    invoke-interface {v0, p1}, Landroidx/compose/foundation/text2/input/ImeActionHandler;->onImeAction-KlQnJC8(I)Z

    move-result p1

    return p1
.end method
