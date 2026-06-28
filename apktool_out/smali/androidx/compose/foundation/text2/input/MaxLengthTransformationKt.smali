.class public final Landroidx/compose/foundation/text2/input/MaxLengthTransformationKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0006"
    }
    d2 = {
        "maxLengthInChars",
        "Landroidx/compose/foundation/text2/input/InputTransformation;",
        "Landroidx/compose/foundation/text2/input/InputTransformation$Companion;",
        "maxLength",
        "",
        "maxLengthInCodepoints",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final maxLengthInChars(Landroidx/compose/foundation/text2/input/InputTransformation$Companion;I)Landroidx/compose/foundation/text2/input/InputTransformation;
    .locals 1
    .param p0    # Landroidx/compose/foundation/text2/input/InputTransformation$Companion;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance p0, Landroidx/compose/foundation/text2/input/MaxLengthFilter;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/compose/foundation/text2/input/MaxLengthFilter;-><init>(IZ)V

    return-object p0
.end method

.method public static final maxLengthInCodepoints(Landroidx/compose/foundation/text2/input/InputTransformation$Companion;I)Landroidx/compose/foundation/text2/input/InputTransformation;
    .locals 1
    .param p0    # Landroidx/compose/foundation/text2/input/InputTransformation$Companion;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance p0, Landroidx/compose/foundation/text2/input/MaxLengthFilter;

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Landroidx/compose/foundation/text2/input/MaxLengthFilter;-><init>(IZ)V

    return-object p0
.end method
