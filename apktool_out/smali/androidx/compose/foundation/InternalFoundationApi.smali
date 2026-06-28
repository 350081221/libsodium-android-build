.class public interface abstract annotation Landroidx/compose/foundation/InternalFoundationApi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->CLASS:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->TYPE:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->METHOD:Ljava/lang/annotation/ElementType;
    }
.end annotation

.annotation build Lkotlin/c1;
    message = "This API is internal to library."
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\u0008\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"
    }
    d2 = {
        "Landroidx/compose/foundation/InternalFoundationApi;",
        "",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ln3/e;
    value = .enum Ln3/a;->BINARY:Ln3/a;
.end annotation

.annotation runtime Ln3/f;
    allowedTargets = {
        .enum Ln3/b;->CLASS:Ln3/b;,
        .enum Ln3/b;->FUNCTION:Ln3/b;,
        .enum Ln3/b;->PROPERTY:Ln3/b;,
        .enum Ln3/b;->PROPERTY_GETTER:Ln3/b;,
        .enum Ln3/b;->PROPERTY_SETTER:Ln3/b;
    }
.end annotation
